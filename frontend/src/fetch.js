async function getAllMacarons() {
    return fetch(`http://localhost:8080/api/macaron`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    });
  };


async function addNewMacaron (macaron) {
    return fetch(`http://localhost:8080/api/macaron/add-macaron`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(macaron)
    })
}



export { getAllMacarons, addNewMacaron };