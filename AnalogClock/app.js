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