<template>
  <div style="width: 100%; overflow: hidden">
    <div>
      <div>
        <h1>Display Result</h1>
        <div>
          <Textarea v-model="info" rows="5" cols="30" />
        </div>
        <div>
          <h1>Date</h1>
          <div>
            <InputText
              type="text"
              class="p-inputtext-sm"
              v-model="date"
              placeholder="YYYY-MM-DD"
            />
          </div>
        </div>
      </div>
      <div>
        <h1></h1>
        <Button label="Fetch" @click="handleClick()" />
      </div>
    </div>
    <div>
      <h1>Delete By Id</h1>
      <div>
        <InputNumber v-model="deleteById" />
        <h1></h1>
        <Button label="Delete" @click="deleteClick()" />
      </div>
      <h1>Update By Id</h1>
      <div>
        <h1>JSON value to update</h1>
        <Textarea
          v-model="updatedJSON"
          rows="5"
          cols="30"
          style="margin-left: 50px"
        />

        <h1>ID to update</h1>

        <InputNumber v-model="updateById" />

        <h1>UpdatedValue</h1>
        <Textarea
          v-model="updatedValue"
          rows="5"
          cols="30"
          style="margin-left: 50px"
        />
      </div>
    </div>
    <div>
      <h1></h1>
      <Button label="Update" @click="updateClick()" />
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";

import axios, { AxiosInstance } from "axios";

import { DefaultApi } from "@/base-frontend/api/default-api";
import { BaseCalendarDto, BaseCelebrationDto } from "@/base-frontend/models";

import InputText from "primevue/inputtext";
import InputNumber from "primevue/inputnumber";
import Button from "primevue/button";
import Textarea from "primevue/textarea";
import { BASE_PATH } from "@/base-frontend/base";
import { Configuration } from "@/base-frontend/configuration";
import { className } from "@/main";

export default defineComponent({
  name: "InternalCall",
  components: {
    InputText,
    InputNumber,
    Button,
    Textarea,
  },
  data: () => {
    return {
      date: "",
      deleteById: 0,

      info: "",
      updatedJSON: "",
      updateById: 0,
      updatedValue: "",
      baseCalendarDto: {} as BaseCalendarDto & className,
    };
  },
  methods: {
    updateClick(): void {
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

      const parsedResponse: BaseCalendarDto = JSON.parse(this.updatedJSON);
      this.baseCalendarDto.date = parsedResponse.date;
      this.baseCalendarDto.season = parsedResponse.season;
      this.baseCalendarDto.seasonWeek = parsedResponse.seasonWeek;
      this.baseCalendarDto.weekday = parsedResponse.weekday;
      this.baseCalendarDto.CelebrationList = parsedResponse.CelebrationList;
      this.baseCalendarDto.className = "BaseCalendarDto";

      api
        .updateCalendarById(this.updateById, this.baseCalendarDto)
        .then((response) => {
          this.updatedValue = JSON.stringify(response.data);
        });
    },
    deleteClick(): void {
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
      api.deleteCalendarById(this.deleteById);
    },
    handleClick(): void {
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
      let val: string | null = null;
      if (this.date !== "") {
        val = this.date;
      }
      api.getCalendar(this.date).then((response) => {
        this.info = JSON.stringify(response.data);
      });
    },
  },
});
</script>
