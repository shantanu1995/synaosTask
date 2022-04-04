import { RouteRecordRaw, createRouter, createWebHashHistory } from "vue-router";
import ExternalCallVue from "../components/ExternalCall.vue";
import InternalCallVue from "../components/InternalCall.vue";
const routes: Array<RouteRecordRaw> = [
  {
    path: "/external",
    name: "ExternalCallVue",
    component: ExternalCallVue,
  },
  {
    path: "/internal",
    name: "InternalCallVue",
    component: InternalCallVue,
  },
];
const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes,
});
export default router;
