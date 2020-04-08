<template>
    <div>
        <h1>登录</h1>
        <input type="text" v-model="user.username" placeholder="请输入5-16位用户名">
        <input type="password" v-model="user.password" placeholder="请输入5-16位密码">
        <button v-on:click="login">登录</button>&nbsp;&nbsp;
        <button v-on:click="register">注册</button>
    </div>
</template>

<script>
    export default {
        name: "Login",
        data() {
            return {
                user: {username: '', password: ''}
            }
        },
        methods: {
            login() {
                this.$axios.post('/login', this.user).then(response => {//response是后端响应的结果
                    //alert(JSON.stringify(response));
                    if (response.data.code == 200) {
                        alert("登录成功！");
                        //跳转到首页
                        this.$router.replace({path: '/index'});
                        //this.$router.push({path: '/index'});
                    } else {
                        alert("登录失败，用户名或密码错误！");
                    }
                })
            },
            register() {
                this.$router.push({path: '/register'})
            }
        }
    }
</script>



