const Tennis = require('./Tennis');


let tennis;

beforeEach(() => {
    tennis = new Tennis();
});

test('When Initial Then Love All', () => {
    checkScore('Love All');
});

test('When a Then Fifteen Love', () => {
    makeAHits(1);
    checkScore('Fifteen Love');
});

test('When aa Then Thirty Love', () => {

    makeAHits(2);
    checkScore('Thirty Love');
});

test('When aaa Then Forty Love', () => {

    makeAHits(3);
    checkScore('Forty Love');
});


test('When b Then Love Fifteen', () => {

    makeBHits(1);
    checkScore('Love Fifteen');
});

test('When bb Then Love Thirty', () => {

    makeBHits(2);
    checkScore('Love Thirty');
});

function makeAHits(times) {
    for (let i = 0; i < times; i++) {
        tennis.a();
    }
}

function makeBHits(times) {
    for (let i = 0; i < times; i++) {
        tennis.b();
    }
}

function checkScore(expected) {
    expect(tennis.score()).toBe(expected);
}
