<template>
  <img alt="Synaos logo" src="./assets/Synaos.png">
  <HelloWorld msg="SYNAOS Task"/>
  <ExternalCall/>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import HelloWorld from './components/HelloWorld.vue';
import ExternalCall from './components/ExternalCall.vue'

export default defineComponent({
  name: 'App',
  components: {
    HelloWorld,
    ExternalCall
  }
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
