/**
 * The FeedsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FeedsService');
const getFeed = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeed);
};

const getFeedIndexLogs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeedIndexLogs);
};

const getFeeds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeeds);
};

const refreshFeed = async (request, response) => {
  await Controller.handleRequest(request, response, service.refreshFeed);
};

const setFeedParams = async (request, response) => {
  await Controller.handleRequest(request, response, service.setFeedParams);
};


module.exports = {
  getFeed,
  getFeedIndexLogs,
  getFeeds,
  refreshFeed,
  setFeedParams,
};
