var exec = require('cordova/exec');

var PLUGIN_NAME = 'ZmPay';

var ZmPay = {
  pay: function(payParams, success, error) {
    exec(success, error, PLUGIN_NAME, 'pay', [payParams]);
  }
};

module.exports = ZmPay;
