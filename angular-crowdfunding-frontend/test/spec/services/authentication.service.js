'use strict';

describe('Service: authentication.service', function () {

  // load the service's module
  beforeEach(module('documentsApp'));

  // instantiate service
  var authentication.service;
  beforeEach(inject(function (_authentication.service_) {
    authentication.service = _authentication.service_;
  }));

  it('should do something', function () {
    expect(!!authentication.service).toBe(true);
  });

});
