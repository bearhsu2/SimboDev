const Tennis = require('./Tennis');

test('init', () => {

    const tennis = new Tennis();

    expect(tennis.score()).toBe('Love All');
});

