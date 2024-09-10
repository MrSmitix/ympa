/**
 * The ReturnsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ReturnsService');
const getReturn = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturn);
};

const getReturnApplication = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnApplication);
};

const getReturnPhoto = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnPhoto);
};

const getReturns = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturns);
};

const setReturnDecision = async (request, response) => {
  await Controller.handleRequest(request, response, service.setReturnDecision);
};

const submitReturnDecision = async (request, response) => {
  await Controller.handleRequest(request, response, service.submitReturnDecision);
};


module.exports = {
  getReturn,
  getReturnApplication,
  getReturnPhoto,
  getReturns,
  setReturnDecision,
  submitReturnDecision,
};
