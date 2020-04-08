<template>
    <div :style="backgroundDiv">
        <div class="title">
            这是首页！
        </div>
    </div>
</template>

<script>
    export default {
        name: "Index"
    }
</script>

<style>
    .title {
        height: 200px;
        width: 400px;
        text-align: center;
        font-size: 50px;
        color: red;
        font-family: "Microsoft YaHei UI";
        line-height: 500px;
    }
</style>

