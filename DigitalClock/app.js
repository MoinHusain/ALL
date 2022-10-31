const container = document.getElementById('container')
const hours = document.getElementById('hours')
const minutes = document.getElementById('minuites')
const seconds = document.getElementById('seconds')
let digital=()=>{
  const now = new Date()
  const hour = now.getHours()
  const minute = now.getMinutes()
  const second = now.getSeconds()
  
   hours.innerHTML=hour;
   minutes.innerHTML=minute;
   seconds.innerHTML=second;
  
  console.log(hour)
  console.log(minute)
  console.log(second)

}
digital()

setInterval(digital,1000)
