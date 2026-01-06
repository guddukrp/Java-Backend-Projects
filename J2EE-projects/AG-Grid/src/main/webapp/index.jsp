<%@ page import= "com.tap.service.Main" %>
<%@ page import= "java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AG-Grid</title>
    <script src="https://cdn.jsdelivr.net/npm/ag-grid-enterprise/dist/ag-grid-enterprise.min.js"></script>
    
    
</head>
<body>
    <h2>This form is ag-grid</h2>
    <div id="mygrid" class="ag-theme-quartz" style="height: 500px;"></div>
    <script >
        const gridDiv = document.getElementById("mygrid");
        const gridOptions = {
        	rowGroupPanelShow: 'always',
        	sideBar:true,
            columnDefs: [
            	{ field: "uuid", headerName: "UUID", sortable: true, filter: true},
                { field: "first_name", headerName: "First Name", sortable: true, filter: true },
                { field: "last_name", headerName: "Last Name", sortable: true, filter: true },
                { field: "address1", headerName: "Address", sortable: true, filter: true },
                { field: "city", sortable: true, filter: true },
                { field: "state", sortable: true, filter: true },
                { field: "phone1", headerName: "Phone", sortable: true, filter: true }
            ],
            defaultColDef:{
            	enableRowGroup:true,
            	resizable:true,
            	floatingFilter:true
            
            },
            
            
            
            rowData: [
            	{ uuid: "guddu", first_name: "JD",last_name:"patna",address1:"patna",city:"patna",state:"patna",phone1:"2122"},
                
            ],
            rowSelection:'multiple',
            animateRow:true,
            onCellClicked:param  => {
                console.log('cell was clicked',param)
            }
            
        };
        new agGrid.Grid(gridDiv,gridOptions);
       	
        var result = '<%= Main.data() %>'; 
        var jsonResult = JSON.parse(result);
        
        console.log(jsonResult);
        gridOptions.api.setRowData(jsonResult);

        
        
    </script>
    
</body>
</html>