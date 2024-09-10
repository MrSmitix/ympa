
# Table `GoodsFeedbackMediaDTO`
(mapped from: GoodsFeedbackMediaDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**photos** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ссылки на фото. |  [optional]
**videos** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ссылки на видео. |  [optional]


# **Table `GoodsFeedbackMediaDTOPhotos`**
(mapped from: GoodsFeedbackMediaDTOPhotos)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsFeedbackMediaDTO | goodsFeedbackMediaDTO | long | | kotlin.Long | Primary Key | *one*
photos | photos | text | | kotlin.String | Foreign Key | *many*



# **Table `GoodsFeedbackMediaDTOVideos`**
(mapped from: GoodsFeedbackMediaDTOVideos)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsFeedbackMediaDTO | goodsFeedbackMediaDTO | long | | kotlin.Long | Primary Key | *one*
videos | videos | text | | kotlin.String | Foreign Key | *many*



