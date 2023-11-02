import Header from "./Header";
import Footer from "./Footer";
import Button from "./Button";
import "./section.css";

const MainPage = () => {
  return (
    <>
      <Header></Header>
      <section className="section" style={{ backgroundImage: `url(/images/macaron-page-background2.jpg)` }}
      >
        <h1>Where the macarons live</h1>
        <Button navigation={"/all-macarons"} text={"Get all macarons"} />
      </section>
      <section className="section" style={{ backgroundImage: `url(/images/macaron-hi-res.jpg)` }}
      >
      </section>
      <section className="section" style={{ backgroundImage: `url(/images/macaron3.jpg)` }}
      >
      </section>
      <section className="last-section" style={{ backgroundColor: "rgb(252, 252, 212)" }}
      ></section>

      <Footer></Footer>
    </>
  );
};

export default MainPage;
