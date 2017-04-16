'use strict';

describe('Service: user.service.localStorage', function () {

  // load the service's module
  beforeEach(module('documentsApp'));

  // instantiate service
  var user.service.localStorage;
  beforeEach(inject(function (_user.service.localStorage_) {
    user.service.localStorage = _user.service.localStorage_;
  }));

  it('should do something', function () {
    expect(!!user.service.localStorage).toBe(true);
  });

});
