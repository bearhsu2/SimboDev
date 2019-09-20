class Main extends eui.UILayer {
    get bScore(): number {
        return this._bScore;
    }

    set bScore(value: number) {
        this._bScore = value;
    }

    private scoreMap:Array<String> = ["Love","Fifteen","Thirty","Forty"];

    get aScore(): number {
        return this._aScore;
    }

    set aScore(value: number) {
        this._aScore = value;
    }

    public score() {
        if(this.aScore != this.bScore)
        {
            return this.scoreMap[this.aScore] + " " + this.scoreMap[this.bScore];
        }

        if(this.aScore > 0)
        {
            return "Fifteen All";
        }

        return "Love All";
    }

    private _aScore:number = 0;
    private _bScore:number = 0;

    public firstPlayerHit() {
        this.aScore ++;
    }

    public secondPlayerHit() {
        this.bScore ++;
    }
}
