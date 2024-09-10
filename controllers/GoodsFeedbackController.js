/**
 * The GoodsFeedbackController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GoodsFeedbackService');
const deleteGoodsFeedbackComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteGoodsFeedbackComment);
};

const getGoodsFeedbackComments = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoodsFeedbackComments);
};

const getGoodsFeedbacks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoodsFeedbacks);
};

const skipGoodsFeedbacksReaction = async (request, response) => {
  await Controller.handleRequest(request, response, service.skipGoodsFeedbacksReaction);
};

const updateGoodsFeedbackComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateGoodsFeedbackComment);
};


module.exports = {
  deleteGoodsFeedbackComment,
  getGoodsFeedbackComments,
  getGoodsFeedbacks,
  skipGoodsFeedbacksReaction,
  updateGoodsFeedbackComment,
};
