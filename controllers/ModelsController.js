/**
 * The ModelsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ModelsService');
const getModel = async (request, response) => {
  await Controller.handleRequest(request, response, service.getModel);
};

const getModelOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getModelOffers);
};

const getModels = async (request, response) => {
  await Controller.handleRequest(request, response, service.getModels);
};

const getModelsOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getModelsOffers);
};

const searchModels = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchModels);
};


module.exports = {
  getModel,
  getModelOffers,
  getModels,
  getModelsOffers,
  searchModels,
};
