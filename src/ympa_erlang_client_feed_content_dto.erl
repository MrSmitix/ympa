-module(ympa_erlang_client_feed_content_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_content_dto/0]).

-type ympa_erlang_client_feed_content_dto() ::
    #{ 'rejectedOffersCount' => integer(),
       'status' => ympa_erlang_client_feed_status_type:ympa_erlang_client_feed_status_type(),
       'totalOffersCount' => integer(),
       'error' => ympa_erlang_client_feed_content_error_dto:ympa_erlang_client_feed_content_error_dto()
     }.

encode(#{ 'rejectedOffersCount' := RejectedOffersCount,
          'status' := Status,
          'totalOffersCount' := TotalOffersCount,
          'error' := Error
        }) ->
    #{ 'rejectedOffersCount' => RejectedOffersCount,
       'status' => Status,
       'totalOffersCount' => TotalOffersCount,
       'error' => Error
     }.
