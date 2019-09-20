describe("Tennis test", function () {
    let main:Main;
    beforeAll(function () {

    });

    beforeEach(function () {
        main = new Main("Kuma","Beck");
    });

    afterEach(function () {

    });

    afterAll(function () {

    });

    it("init then Love All", function () {
        check("Love All");
    });

    it("test Fifteen Love", function () {
        firstPlayerHitLoop(1);
        check("Fifteen Love");
    });

    it("test Thirty Love", function () {
        firstPlayerHitLoop(2);
        check("Thirty Love");
    });

    it("test Forty Love", function () {
        firstPlayerHitLoop(3);
        check("Forty Love");
    });

    it("test Love Fifteen", function () {
        secondPlayerHitLoop(1);
        check("Love Fifteen");
    });

    it("test Love Thirty", function () {
        secondPlayerHitLoop(2);
        check("Love Thirty");
    });

    it("test Fifteen All", function () {
        firstPlayerHitLoop(1);
        secondPlayerHitLoop(1);
        check("Fifteen All");
    });

    it("test Thirty All", function () {
        firstPlayerHitLoop(2);
        secondPlayerHitLoop(2);
        check("Thirty All");
    });

    it("test Deuce", function () {
        firstPlayerHitLoop(3);
        secondPlayerHitLoop(3);
        check("Deuce");
    });

    it("test Kuma Adv.", function () {
        firstPlayerHitLoop(4);
        secondPlayerHitLoop(3);
        check("Kuma Adv.");
    });

    it("test Beck Adv.", function () {
        firstPlayerHitLoop(3);
        secondPlayerHitLoop(4);
        check("Beck Adv.");
    });

    it("test Beck Wins", function () {
        firstPlayerHitLoop(3);
        secondPlayerHitLoop(5);
        check("Beck Wins");
    });

    it("test Kuma Wins", function () {
        firstPlayerHitLoop(4);
        secondPlayerHitLoop(1);
        check("Kuma Wins");
    });

    function firstPlayerHitLoop(count:number)
    {
        for(let i:number = 0 ; i < count ; i ++)
        {
            main.firstPlayerHit();
        }
    }

    function secondPlayerHitLoop(count:number)
    {
        for(let i:number = 0 ; i < count ; i ++)
        {
            main.secondPlayerHit();
        }
    }

    function check(val:string)
    {
        expect(main.score()).toEqual(val);
    }
})