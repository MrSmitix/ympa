-module(ympa_erlang_client_add_offers_to_archive_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_add_offers_to_archive_error_dto/0]).

-type ympa_erlang_client_add_offers_to_archive_error_dto() ::
    #{ 'offerId' := binary(),
       'error' := ympa_erlang_client_add_offers_to_archive_error_type:ympa_erlang_client_add_offers_to_archive_error_type()
     }.

encode(#{ 'offerId' := OfferId,
          'error' := Error
        }) ->
    #{ 'offerId' => OfferId,
       'error' => Error
     }.
