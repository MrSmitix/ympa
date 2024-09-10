
# Table `GetCampaignLoginsResponse`
(mapped from: GetCampaignLoginsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**logins** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список логинов. | 


# **Table `GetCampaignLoginsResponseLogins`**
(mapped from: GetCampaignLoginsResponseLogins)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignLoginsResponse | getCampaignLoginsResponse | long | | kotlin.Long | Primary Key | *one*
logins | logins | text | | kotlin.String | Foreign Key | *many*



