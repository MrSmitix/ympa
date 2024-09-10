package models

// ForwardScrollingPagerDto - Ссылка на следующую страницу. 
type ForwardScrollingPagerDto struct {

	// Идентификатор следующей страницы результатов.
	NextPageToken string `json:"nextPageToken,omitempty"`
}
