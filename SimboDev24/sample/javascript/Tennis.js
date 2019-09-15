class Tennis {


    constructor() {
        this.aScore = 0;
    }

    a() {
        this.aScore += 1;
    }

    score() {

        if (this.aScore > 0) {
            return 'Fifteen Love';
        }

        return 'Love All';
    }

}

module.exports = Tennis;
