import { createApp } from 'vue'
import App from './App.vue'
import router from '@/router'

createApp(App).use(router).mount('#app')

export interface className{
    className: string;
}
