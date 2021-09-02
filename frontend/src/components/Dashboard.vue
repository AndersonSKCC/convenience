<template>

<v-data-table
    :headers="headers"
    :items="dashboard"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'Dashboard',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "productId", value: "productId" },
            { text: "productName", value: "productName" },
            { text: "productPrice", value: "productPrice" },
            { text: "customerId", value: "customerId" },
            { text: "customerName", value: "customerName" },
            { text: "customerPhone", value: "customerPhone" },
            { text: "reserveQty", value: "reserveQty" },
            { text: "reserveDate", value: "reserveDate" },
            { text: "pickupDate", value: "pickupDate" },
            { text: "totalPrice", value: "totalPrice" },
            { text: "reserveId", value: "reserveId" },
            { text: "payHistoryId", value: "payHistoryId" },
            { text: "payHistoryStatus", value: "payHistoryStatus" },
            { text: "reserveStatus", value: "reserveStatus" },
        ],
        dashboard : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/dashboards')

      this.dashboard = temp.data._embedded.dashboards;

    },
    methods: {
    }
  }
</script>

