<template>
  <div class="banner" :style="{ 'background-color': boolmall ? '#f4f4f4' : 'transparent' }">
    <img :src=m alt="tp">
    <h2>{{ h }}</h2>
    <p>{{ p }}</p>
    <button @click="kk" title="了解更多">了解详情</button>
  </div>
</template>

<script setup>
import { defineProps } from 'vue';

defineProps({
  m: String,
  h: String,
  p: String,
  boolmall: Boolean
});
const kk = () => {
  alert("点击");
};

</script>

<style>
.banner {
  display: flex;
  flex-direction: column;
  height: 700px;
  padding: 2px 20px;
}

.banner img {
  margin: 2px 25%;
}

.banner h2 {
  margin: 5px 3%;
  font-size: 250%;
}

.banner p {
  margin: 5px 3%;
}

.banner button {
  width: 80px;
  margin: 5px 3%;
}
</style>













