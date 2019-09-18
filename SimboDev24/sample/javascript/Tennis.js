function Tennis() {


    this.aHits = 0;

    this.a = function () {
        this.aHits++;
    };

    this.score = function () {

        if (this.aHits > 0) {
            return 'Fifteen Love';
        }


        return 'Love All';
    }

}


module.exports = Tennis;