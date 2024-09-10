/**
 * The OutletsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/OutletsService');
const createOutlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.createOutlet);
};

const deleteOutlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteOutlet);
};

const getOutlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOutlet);
};

const getOutlets = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOutlets);
};

const updateOutlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOutlet);
};


module.exports = {
  createOutlet,
  deleteOutlet,
  getOutlet,
  getOutlets,
  updateOutlet,
};
