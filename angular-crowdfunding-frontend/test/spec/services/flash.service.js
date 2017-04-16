'use strict';

describe('Service: flash.service', function () {

  // load the service's module
  beforeEach(module('documentsApp'));

  // instantiate service
  var flash.service;
  beforeEach(inject(function (_flash.service_) {
    flash.service = _flash.service_;
  }));

  it('should do something', function () {
    expect(!!flash.service).toBe(true);
  });

});
