<template>
  <div style="width: 100%; overflow: hidden">
    <div>
      <div>
        <h1>Display Result</h1>
        <div>
          <Textarea v-model="info" rows="5" cols="30" />
        </div>
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
      <div>
        <h1></h1>
        <Button label="Fetch" @click="handleClick()" />
      </div>
    </div>
    <div>
      <h1>Delete By Id</h1>
      <div>
        <InputNumber v-model="deleteById" />
      </div>
    </div>
    <div>
      <h1></h1>
      <Button label="Delete" @click="deleteClick()" />
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";

import axios, { AxiosInstance } from "axios";

import { DefaultApi } from "@/base-frontend/api/default-api";

import InputText from "primevue/inputtext";
import InputNumber from "primevue/inputnumber";
import Button from "primevue/button";
import Textarea from "primevue/textarea";
import { BASE_PATH } from "@/base-frontend/base";
import { Configuration } from "@/base-frontend/configuration";

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
    };
  },
  methods: {
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
