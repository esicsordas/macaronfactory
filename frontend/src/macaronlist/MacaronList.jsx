import { useEffect, useState } from "react";
import Footer from "../mainpage/Footer";
import Header from "../mainpage/Header";
import MacaronCard from "./MacaronCard";
import { getAllMacarons } from "../fetch";

const MacaronList = () => {
  const [macarons, setMacarons] = useState(null);

async function fetchMacarons() {
    const response = await getAllMacarons();
    const data = await response.json();
    if (!response.ok) {
        throw new Error("Request failed");
    }
    setMacarons(data)
}

  useEffect(() => {
    fetchMacarons();
  }, []);

  return (
    <>
      <Header></Header>
      {macarons &&
        macarons.map((macaron) => (
          <tr key={macaron.id}>
            <td>
              <div>
                <MacaronCard name={macaron.name} />
              </div>
            </td>
          </tr>
        ))}
      <Footer></Footer>
    </>
  );
};

export default MacaronList;
