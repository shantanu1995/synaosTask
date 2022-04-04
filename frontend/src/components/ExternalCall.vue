<template>
  <div style="width: 100%; overflow: hidden">
    <div>{{ url }}</div>
    <div>
      <InputText type="text" class="p-inputtext-sm" v-model="value" />
      <Button label="Submit" @click="handleClick()" />
    </div>
    <div>
      <Textarea v-model="info" rows="5" cols="30" />
    </div>
    <div>
      <Button label="Save" @click="saveToDatabase()" />
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";

import axios, { AxiosInstance } from "axios";

import { DefaultApi } from "@/base-frontend/api/default-api";

import InputText from "primevue/inputtext";
import Button from "primevue/button";
import Textarea from "primevue/textarea";
import { BaseCalendarDto, BaseCelebrationDto } from "@/base-frontend/models";
import { BASE_PATH } from "@/base-frontend/base";
import { Configuration } from "@/base-frontend/configuration";
import { className } from "@/main";

export default defineComponent({
  name: "ExternalCall",
  components: {
    InputText,
    Button,
    Textarea,
  },
  data: () => {
    return {
      url: "http://calapi.inadiutorium.cz/api/v0/en/calendars/default/",
      value: "",

      info: "",
      baseCalendarDto: {} as BaseCalendarDto & className,
    };
  },
  methods: {
    handleClick(): void {
      const temp = this.url;
      this.url = this.url + this.value;
      console.log(this.url);
      axios.get(this.url).then((response) => {
        console.log(response.data);
        this.baseCalendarDto.date = response.data.date;
        this.baseCalendarDto.season = response.data.season;
        this.baseCalendarDto.seasonWeek = response.data.season_week;
        this.baseCalendarDto.weekday = response.data.weekday;
        const celebrationList: BaseCelebrationDto[] = [];
        for (var celebration of response.data.celebrations) {
          const celebrationDto: BaseCelebrationDto = {};
          celebrationDto.title = celebration.title;
          celebrationDto.colour = celebration.colour;
          celebrationDto.ranker = celebration.rank;
          celebrationDto.rankNo = celebration.rank_num;
          celebrationList.push(celebrationDto);
        }
        this.baseCalendarDto.CelebrationList = celebrationList;
        this.baseCalendarDto.className = "BaseCalendarDto";
        this.info = JSON.stringify(this.baseCalendarDto);
      });

      console.log(this.info);
      this.url = temp;
    },
    saveToDatabase(): void {
      const axiosInstance: AxiosInstance = axios.create({
        headers: {
          "Access-Control-Allow-Origin": "*",
        },
      });
      const api: DefaultApi = new DefaultApi(
        new Configuration(),
        BASE_PATH + ":8443",
        axiosInstance
      );
      api.createCalendar(this.baseCalendarDto).then((response) => {
        console.log(response.data);
      });
    },
  },
});
</script>
