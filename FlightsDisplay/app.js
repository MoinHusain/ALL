const tableBody = document.getElementById('tableBody')

let flights = [
  {
    Time: "08:11",
    Destination: "OMAN",
    Gate: "A 01",
    Status: "ON TIME"
  },
  {
    Time: "12:39",
    Destination: "LONDON",
    Gate: "C 31",
    Status: "CANCELLED"
  },
  {
    Ttime: "13:21",
    Destination: "DUBAI",
    Gate: "A 19",
    Status: "DELAYED"
  },
  {
    Time: "14:01",
    Destination: "TORONTO",
    Gate: "B 02",
    Status: "ON TIME"
  }
]
function fillup() {
  for (const flight of flights) {
    const tableRow = document.createElement('tr')
    for (const details in flight) {
      const tableCell =document.createElement('td')
      const word = Array.from(flight[details])
      for (const [index,letter] of word.entries()){
        const letterElement = document.createElement("div") 
        setTimeout(() => { 
           letterElement.classList.add('flip') 
           letterElement.textContent = letter 
           tableCell.append(letterElement) 
         }, 100 * index)
      }
      tableRow.append(tableCell)
    }
    tableBody.append(tableRow)
  }
}
fillup()
console.log(tableBody)
