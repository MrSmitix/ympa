package models

type GetFeedIndexLogsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result FeedIndexLogsResultDto `json:"result,omitempty"`
}
