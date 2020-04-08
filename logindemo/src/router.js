import Vue from 'vue'
import Router from 'vue-router'
import Index from "@/components/Index";
import Login from "@/components/Login";
import Register from "@/components/Register";

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            redirect: '/login'
        },
        {
            path: '/login',
            name: 'Login',
            component: Login
        },
        {
            path: '/index',
            name: 'Index',
            component: Index
        },
        {
            path: '/register',
            name: 'Register',
            component: Register
        }
    ]
})
