class Main extends eui.UILayer {

    private _playerNameA:string = "";
    private _playerNameB:string = "";

    get playerNameB(): string {
        return this._playerNameB;
    }

    set playerNameB(value: string) {
        this._playerNameB = value;
    }
    get playerNameA(): string {
        return this._playerNameA;
    }

    set playerNameA(value: string) {
        this._playerNameA = value;
    }

    constructor (nameA:string,nameB:string){
        super();
        this.playerNameA = nameA;
        this.playerNameB = nameB;
    }

    private _aScore:number = 0;
    private _bScore:number = 0;

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
            if(this.havePlayerScoreMoreThanThree())
                if(this.getPlayerScoreDiff() == 1)
                    return this.getHigherScorePlayerName() + " Adv.";
                else
                    return this.getHigherScorePlayerName() + " Wins";
            else
                return this.getDiffScoreLookUp();
        }
        else {
            if(this.aScore >= 3)
                return "Deuce";
            else
                return this.getSameScoreLookUp();
        }
    }

    private getSameScoreLookUp() {
        return this.scoreMap[this.aScore] + " All";
    }

    private getDiffScoreLookUp() {
        return this.scoreMap[this.aScore] + " " + this.scoreMap[this.bScore];
    }

    private getPlayerScoreDiff() {
        return Math.abs(this.aScore - this.bScore);
    }

    private getHigherScorePlayerName() {
        return this.aScore > this.bScore ? this.playerNameA : this.playerNameB;
    }

    private havePlayerScoreMoreThanThree() {
        return this.aScore > 3 || this.bScore > 3;
    }

    public firstPlayerHit() {
        this.aScore ++;
    }

    public secondPlayerHit() {
        this.bScore ++;
    }
}
