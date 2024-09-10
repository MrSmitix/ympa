-module(ympa_erlang_client_update_time_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_time_dto/0]).

-type ympa_erlang_client_update_time_dto() ::
    #{ 'updatedAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'updatedAt' := UpdatedAt
        }) ->
    #{ 'updatedAt' => UpdatedAt
     }.
