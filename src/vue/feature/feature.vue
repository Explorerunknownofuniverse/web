<template>
  <div class="feature">
    <h2>课程特色</h2>
    <div> 
      <span>
      <img src="../../resource/m1.png" alt="lgo">
      <h4>丰富的教学服务</h4>
      <p>特色教学服务功能，各种配套教学服务，在线学习从未如此轻松！</p>
      <a href="https://www.bilibili.com/">马上学习 ></a>
     </span>
     <span>
      <img src="../../resource/m2.png" alt="lgo">
      <h4>多元的学习方式</h4>
      <p>知识提炼、答疑解惑、实时互动、开发有特色的教学服务方式。</p>
      <a href="https://www.bilibili.com/">马上学习 ></a>
     </span>
     <span>
      <img src="../../resource/m3.png" alt="lgo">
      <h4>高品质的学习体验</h4>
      <p>多屏合一，随时学习，随时在线，学习记录一目了然，知识充电不再受限。</p>
      <a href="https://www.bilibili.com/">马上学习 ></a>
     </span>
    </div>
  </div>
</template>

<script setup>

</script>
<style>
.feature{
  display: flex;
  flex-direction: column;
  padding: 2px;
}
.feature h2{
  margin: 2% 3% 5%;
  border-bottom: 1px solid;
  padding: 5px;
}
.feature span{
  display: inline-block;
  width: 400px;
  margin: 0 0 0 5%;
}
.feature span h4{
  font-size: 25px;
  margin: 0 0 0 5px;
}
.feature span p{
  font-size: 15px;
  margin: 5px 0 10px 5px;
}
.feature span a{
  margin: 0 0 0 5px;
}
</style>