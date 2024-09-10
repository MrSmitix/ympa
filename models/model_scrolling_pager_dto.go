package models

// ScrollingPagerDto - Информация о страницах результатов.
type ScrollingPagerDto struct {

	// Идентификатор следующей страницы результатов.
	NextPageToken string `json:"nextPageToken,omitempty"`

	// Идентификатор предыдущей страницы результатов.
	PrevPageToken string `json:"prevPageToken,omitempty"`
}
