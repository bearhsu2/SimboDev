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

test('When aa Then Thirty Love', () => {
    aScore(2);
    checkScore('Thirty Love')
});

test('When aaa Then Forty Love', () => {
    aScore(3);
    checkScore('Forty Love')
});


test('When b Then Love Fifteen', () => {
    tennis.b()
    checkScore('Love Fifteen')
});

function checkScore(expected) {
    expect(tennis.score()).toBe(expected);
}

function aScore(times) {
    for (let i = 0; i < times; i++) {
        tennis.a();
    }
}

