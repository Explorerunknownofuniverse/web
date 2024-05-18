<template>
  <div class="header">
    <span>
      <img src="../../resource/logo-white.svg" alt="logo">
     <span>
       <button @click="login">登陆</button>
       <button @click="enroll">注册</button>
     </span> 
   </span>
   <span class="txt">
     <h1>云端编程，浏览器里边学边练</h1>
     <h4>软件定义一切，网络连接时空，学习软件技术，创造未来世界。</h4>
   </span>
   <button @click="toll" >马上学习</button>
  </div>
</template>
<script setup>
const model = defineModel()
function login() {

  model.value = 1;
 
}

function enroll() {
  model.value = 2;

}
function toll(){
  alert("点击");
}
</script>
<style scoped>
.header{
  display: flex;
  flex-direction: column;
  height: 420px;
  padding: 2px;
  background-image: url('../../resource/home-banner@2x.jpg');
  background-size:100% 100%;
}
.header span img{
  margin: 2px 20px 2px 40px;
}
.header span span{
  float:right;
  margin: 5px 20px;

}
.header span button{
  height:40px;
  width: 50px;
  margin: 0px 5px;
  background-color: rgba(52, 63, 223, 0.533);
  color:white;
  border-color: aliceblue;
  border-radius: 15%;
  font-size: 15px;
  box-sizing: content-box;
}
.header .txt{
  display: block;
height: 100px;
width:1000px;
margin: 70px auto;
padding: 1px;
}
.header h1{
  color: white;
  display: block;
  margin: 10px 70px;
  font-family: 宋体;
  font-size: 60px;
}
.header h4{
  margin: 5px 210px;
  color: white;
  font-size: 18px;
  font-family: 宋体;
}
.header button{
  height: 50px;
  width: 200px;
  margin: 0 auto;
  color:rgba(52, 63, 223, 0.863);
  border-color: aliceblue;
  border-radius: 3%;
  font-size: 20px;
  box-sizing: content-box;
  font-family: 宋体;
}
</style>
