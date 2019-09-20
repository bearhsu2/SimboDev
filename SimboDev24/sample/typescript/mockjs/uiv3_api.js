var gameType = 8;
var machineType = 8001;

var initTicket = {
    "gameType": gameType,
    "machineType": machineType,
    "status": "0000",
    "sessionID": [
        "",
        "",
        "",
        "CD4414C0DB1C781891548BE8B2E2EF94C4FA09ECB3F217EC80134E76AC1949DE2BB77F919B9D1B6B055679E4F9E791AEC05A47308BF780CE8912FFE4EC9004F18E559FC55E4B44E372AAC761FB5B3E4CE5DCAD76EFCAEE39E25F3DB4F6A12ADFCBFC334C3AE9B1E0FE525D0960C34653758FB05BC8B020CD6E935C77E8F6725839BE375CE939BC54903E1518C5BE1272CC126D06C010ADE7E0AAE5A2E46949CB0D253C217CA6D2AA8966B36DF054AD803D7DD7CAB635DA5B560B6BF472F0E370EEBC6A14612EDF669C10C84E40236744BC901F0B0E2AA906FB444CF6736D873CD286101281A509407FAD2264B4FF249E28FE73B0AE0D852D5C36A5BB695ECE06215D83E10E139114CBC4E57A57E619775A5193E3CEF0FACA44C900598175F6A099945EA45198BBC807F7B1E142484B221306B5EA35BDA10D48F6C545AB57447B573633757D948063C0D2D0638287C361BA27D91C43DDE86F603821E140F57D44BC4789287C5DBE58D4F4B55B58B3044FA2037C23D2A86363DC8B982F38EE760BB4663FFB38760D5CAF21D35808D3157BA73BE53696190AC2",
        ""
    ],
    "zone": "JDB_ZONE_GAME",
    "gsInfo": "10.20.8.30_28888_18080",
    "isRecovery": false,
    "s0": "",
    "s1": "",
    "s2": "",
    "s3": "CD4414C0DB1C781891548BE8B2E2EF94C4FA09ECB3F217EC80134E76AC1949DE2BB77F919B9D1B6B055679E4F9E791AEC05A47308BF780CE8912FFE4EC9004F18E559FC55E4B44E372AAC761FB5B3E4CE5DCAD76EFCAEE39E25F3DB4F6A12ADFCBFC334C3AE9B1E0FE525D0960C34653758FB05BC8B020CD6E935C77E8F6725839BE375CE939BC54903E1518C5BE1272CC126D06C010ADE7E0AAE5A2E46949CB0D253C217CA6D2AA8966B36DF054AD803D7DD7CAB635DA5B560B6BF472F0E370EEBC6A14612EDF669C10C84E40236744BC901F0B0E2AA906FB444CF6736D873CD286101281A509407FAD2264B4FF249E28FE73B0AE0D852D5C36A5BB695ECE06215D83E10E139114CBC4E57A57E619775A5193E3CEF0FACA44C900598175F6A099945EA45198BBC807F7B1E142484B221306B5EA35BDA10D48F6C545AB57447B573633757D948063C0D2D0638287C361BA27D91C43DDE86F603821E140F57D44BC4789287C5DBE58D4F4B55B58B3044FA2037C23D2A86363DC8B982F38EE760BB4663FFB38760D5CAF21D35808D3157BA73BE53696190AC2",
    "s4": "",
    "isTelAcct": false,
    "gameUid": "由程式亂數產生",
    "gamePass": "d9e9f6d",
    "currency": "THB",
    "isStreamingGame": false
}

var userInfo = {
    "lang": "cn",
    "uid": "sptest1987",
    "currencySystemName": 'TB',
    "decimalPoint": 3,
    autoPlayList: [5, 10, 100, 300]
}

var servInfo = {
    gameHost : "https://www.sqntbw.com/games/",
    enableInfoLog: true,
    enableErrorLog: true
}

var gameData = {
    isDemo: false,
    isShowGoHome: true,
    isShowPlayerReport: true
}

var callBackLog = {};
callBackLog.h5Log = (data)=>{ log("h5Log",data); };

function log(msg, ... params) {
    for (var i = 0; i < params.length; i++) {
        if (i == 0) {
            msg += ": " + params[i];
        } else {
            msg += ", " + params[i];
        }
    }

    console.log(msg);
}

function showErrorMsgByCode(code, value) {
    log("showErrorMsgByCode", code, value);
    console.log("End: " + new Date().getSeconds() + " sec.");
}

function resetWebErrors() {
    log("resetWebErrors");
}

function getUIVersion(display) {
    log("getUIVersion", display);
    return {version: "1.2.77", gameVersion: "aa75c9b", display: true};
}

function updateTicket() {
    log("updateTicket");
    updatedTicket(params.initTicket);
}

function reconnect() {
    log("reconnect"); 
    updatedTicket(initTicket);
}

function initTotalBetSelection(totalBetList, idx, paramObj) {
    log("initTotalBetSelection", totalBetList, idx, paramObj);
}

function initLine(value) {
    log("initLine", value);
}

function sendGameState(setParam) {
    log("sendGameState", setParam);
}

function setLineOrWayGame(type) {
    log("setLineOrWayGame", type);
}

function setHtmlBodyGameState(state) {
    log("setHtmlBodyGameState", state);
}

function setElementDisplayById(objId, value) {
    log("setElementDisplayById", objId, value);
}

function toggleElementStyle(elemId, styleName, action) {
    log("toggleElementStyle", elemId, styleName, action);
}

function getPlayerCredit() {
    log("getPlayerCredit");
}

function updateHtmlCredit() {
    log("updateHtmlCredit");
}

function updateHtmlPlayerWin(data) {
    log("updateHtmlPlayerWin", data);
}

function updateWebAutoTimesSpan(data) {
    log("updateWebAutoTimesSpan", data);
}

function updateMobileAutoTimesSpan(data) {
    log("updateMobileAutoTimesSpan", data);
}

function updateSpinNumber(data) {
    log("updateSpinNumber", data);
}