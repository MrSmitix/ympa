-module(ympa_erlang_client_time_period_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_time_period_dto/0]).

-type ympa_erlang_client_time_period_dto() ::
    #{ 'timePeriod' := integer(),
       'timeUnit' := ympa_erlang_client_time_unit_type:ympa_erlang_client_time_unit_type(),
       'comment' => binary()
     }.

encode(#{ 'timePeriod' := TimePeriod,
          'timeUnit' := TimeUnit,
          'comment' := Comment
        }) ->
    #{ 'timePeriod' => TimePeriod,
       'timeUnit' => TimeUnit,
       'comment' => Comment
     }.
