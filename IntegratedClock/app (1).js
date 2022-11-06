const secs = document.getElementById('secs')
const mins = document.getElementById('mins')
const hours = document.getElementById('hours')


   getTime=()=>{
  const now = new Date()
  const seconds = now.getSeconds()
  const minutes= now.getMinutes()
  const hour= now.getHours()
  const interval= 6
     
   secs.style.transform='rotate('+(seconds * interval)+'deg)'
   mins.style.transform='rotate('+(minutes * interval)+'deg)'
   hours.style.transform='rotate('+(hour * interval*5)+'deg)'

console.log(seconds)
console.log(minutes)
console.log(hour)

}

getTime()
     setInterval(getTime,1000)



const container = document.getElementById('container')
const hou = document.getElementById('hou')
const minutes = document.getElementById('minuites')
const seconds = document.getElementById('seconds')
let digital=()=>{
  const no = new Date()
  const ho = no.getHours()
  const minute = no.getMinutes()
  const second = no.getSeconds()
  
   hou.innerHTML=ho;
   minutes.innerHTML=minute;
   seconds.innerHTML=second;
  
  console.log(hou)
  console.log(minute)
  console.log(second)

}
digital()

setInterval(digital,1000)