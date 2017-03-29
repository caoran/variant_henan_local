---oracle数据闪回
--1
select * from t_user_test as of timestamp to_timestamp('2016-10-31 11:27:30', 'yyyy-mm-dd hh24:mi:ss');
alter table t_user_test enable row movement;
flashback table t_user_test to timestamp TO_TIMESTAMP('2016-10-31 11:27:30','yyyy-mm-dd hh24:mi:ss');

--2
select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss') time, to_char(dbms_flashback.get_system_change_number) scn from dual;
select * from t_user_test as of scn 13891603334352;



--SOAP调整核查任务工单的名称、制作时间    修改其中的SHEET_CODE列--------名称CREATE_TIME列------------------工单时间
select * from tai_inas_sheet WHERE sheet_CODE LIKE 'HA-044-160427-00002%'
SOAP--调整核查任务的核查制作人     修改其中的列HANDLE_TIME------操作人
select * from TAI_INAS_ORDER where order_code like 'HA-044-160516-00002%' for update 
---修改为归档状态
orderstate_id =4