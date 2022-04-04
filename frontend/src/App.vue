<template>
  <img alt="Synaos logo" src="./assets/Synaos.png" />
  <HelloWorld msg="SYNAOS Task" />

  <div>
    <router-link class="nav-link" to="/external" @click="onClick()">External</router-link>
    <router-link class="nav-link" to="/internal" @click="onClick()">Internal</router-link>
  </div>
  <div>
    <a href="" @click="hide()">Hide</a>
  </div>
  <router-view v-if="value"></router-view>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import HelloWorld from "./components/HelloWorld.vue";

export default defineComponent({
  name: "App",
  components: {
    HelloWorld,
  },
  data: () => {
    return {
      value: false
    };
  },
  methods: {
    onClick(): void{
      this.value = true;
    },

    hide(): void{
      this.value = false;
    }

  },
});
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
