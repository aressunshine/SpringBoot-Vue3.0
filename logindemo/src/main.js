import Vue from 'vue'
import App from './App.vue'
import router from "./router"
import axios from 'axios'

// 将axios绑定到全局
Vue.prototype.$axios = axios
//阻止启动生产消息
Vue.config.productionTip = false

new Vue({
    //在new Vue的时候需要把router加进去才能正常使用路由。
    router,
    render: h => h(App),
}).$mount('#app')
