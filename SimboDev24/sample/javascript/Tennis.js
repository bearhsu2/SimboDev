const hitsToScore = new Map();

hitsToScore.set(1, "Fifteen");
hitsToScore.set(2, "Thirty");
hitsToScore.set(3, "Forty");

function Tennis() {


    this.aHits = 0;

    this.a = function () {
        this.aHits++;
    };

    this.score = function () {

        if (this.aHits > 0) {
            return hitsToScore.get(this.aHits) + ' Love';
        }

        return 'Love All';
    }

}


module.exports = Tennis;