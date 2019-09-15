const Tennis = require('./Tennis');

let tennis;

beforeEach(() => {
    tennis = new Tennis();
});

test('When Initial Then Love All', () => {
    checkScore('Love All');
});


test('When a Then Fifteen Love', () => {
    aScore(1);
    checkScore('Fifteen Love')
});

function aScore(times) {
    for (let i = 0; i < times; i++) {
        tennis.a();
    }
}

test('When aa Then Thirty Love', () => {
    aScore(2);
    checkScore('Thirty Love')
});

function checkScore(expected) {
    expect(tennis.score()).toBe(expected);
}

