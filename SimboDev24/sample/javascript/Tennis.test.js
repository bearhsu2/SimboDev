const Tennis = require('./Tennis');


test('When Initial Then Love All', () => {
    const tennis = new Tennis();
    expect(tennis.score()).toBe('Love All');
});
