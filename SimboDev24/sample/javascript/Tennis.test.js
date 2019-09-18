const Tennis = require('./Tennis');


test('When Initial Then Love All', () => {
    const tennis = new Tennis();
    expect(tennis.score()).toBe('Love All');
});

test('When a Then Fifteen Love', () => {
    const tennis = new Tennis();
    tennis.a();
    expect(tennis.score()).toBe('Fifteen Love');
});
