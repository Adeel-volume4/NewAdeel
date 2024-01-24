<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <title>Activity Control- Dashboard</title>

    <!-- Custom fonts for this template-->
    <link href="/resources/assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/resources/assets/css/sb-admin-2.min.css" rel="stylesheet">
    
    
    
    <style>
    /* body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .table-container {
      width: 80%;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      background-color: #fff;
      border-radius: 8px;
      overflow: hidden;
    }

    th, td {
      border: 1px solid #ddd;
      padding: 12px;
      text-align: left;
    }

    th {
      background-color: #3498db;
      color: #fff;
    }

    .expandable-row {
      cursor: pointer;
      transition: background-color 0.3s;
    }

    .expandable-row:hover {
      background-color: #f5f5f5;
    }

    .nested-table {
      width: 100%;
      display: none;
    }

    .nested-th, .nested-td {
      border: 1px solid #ddd;
      padding: 10px;
      text-align: left;
      background-color: #ecf0f1;
    }

    .toggle-button {
      cursor: pointer;
      font-weight: bold;
      color: #3498db;
      transition: color 0.3s;
    }

    .toggle-button:hover {
      color: #2980b9;
    } */
  </style>
    
    
    

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/api/index">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Activity Control</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="index">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>Dashboard</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Interface
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>User Data</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <!-- <h6 class="collapse-header"><button onclick="fetchData()">Attendance</button></h6> -->
                        <a class="collapse-item" href="buttons.jsp">Buttons</a>
                        <a class="collapse-item" href="cards.jsp">Cards</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                    <i class="fas fa-fw fa-wrench"></i>
                    <span>Utilities</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Utilities:</h6>
                        <a class="collapse-item" href="utilities-color.jsp">Colors</a>
                        <a class="collapse-item" href="utilities-border.jsp">Borders</a>
                        <a class="collapse-item" href="utilities-animation.jsp">Animations</a>
                        <a class="collapse-item" href="utilities-other.jsp">Other</a>
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Addons
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                    aria-expanded="true" aria-controls="collapsePages">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Pages</span>
                </a>
                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Login Screens:</h6>
                        <a class="collapse-item" href="login.jsp">Login</a>
                        <a class="collapse-item" href="register.jsp">Register</a>
                        <a class="collapse-item" href="forgot-password.jsp">Forgot Password</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Other Pages:</h6>
                        <a class="collapse-item" href="404.jsp">404 Page</a>
                        <a class="collapse-item" href="blank.jsp">Blank Page</a>
                    </div>
                </div>
            </li>

           

            <!-- Nav Item - Tables -->
            <li class="nav-item">
                <a class="nav-link" href="tables.jsp">
                    <i class="fas fa-fw fa-table"></i>
                    <span>Tables</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

            
        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Search -->
                    <form
                        class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                        <div class="input-group">
                            <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."
                                aria-label="Search" aria-describedby="basic-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-primary" type="button">
                                    <i class="fas fa-search fa-sm"></i>
                                </button>
                            </div>
                        </div>
                    </form>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none">
                            <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-search fa-fw"></i>
                            </a>
                            <!-- Dropdown - Messages -->
                            <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                                aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto w-100 navbar-search">
                                    <div class="input-group">
                                        <input type="text" class="form-control bg-light border-0 small"
                                            placeholder="Search for..." aria-label="Search"
                                            aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button class="btn btn-primary" type="button">
                                                <i class="fas fa-search fa-sm"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </li>

                        <!-- Nav Item - Alerts -->
                        <li class="nav-item dropdown no-arrow mx-1">
                            <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-bell fa-fw"></i>
                                <!-- Counter - Alerts -->
                                <span class="badge badge-danger badge-counter">3+</span>
                            </a>
                            <!-- Dropdown - Alerts -->
                            <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="alertsDropdown">
                                <h6 class="dropdown-header">
                                    Alerts Center
                                </h6>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-primary">
                                            <i class="fas fa-file-alt text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">December 12, 2019</div>
                                        <span class="font-weight-bold">A new monthly report is ready to download!</span>
                                    </div>
                                </a>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-success">
                                            <i class="fas fa-donate text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">December 7, 2019</div>
                                        $290.29 has been deposited into your account!
                                    </div>
                                </a>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-warning">
                                            <i class="fas fa-exclamation-triangle text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">December 2, 2019</div>
                                        Spending Alert: We've noticed unusually high spending for your account.
                                    </div>
                                </a>
                                <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
                            </div>
                        </li>

                        <!-- Nav Item - Messages -->
                        <li class="nav-item dropdown no-arrow mx-1">
                            <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-envelope fa-fw"></i>
                                <!-- Counter - Messages -->
                                <span class="badge badge-danger badge-counter">7</span>
                            </a>
                            <!-- Dropdown - Messages -->
                            <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="messagesDropdown">
                                <h6 class="dropdown-header">
                                    Message Center
                                </h6>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle" src="/resources/assets/img/undraw_profile_1.svg"
                                            alt="...">
                                        <div class="status-indicator bg-success"></div>
                                    </div>
                                    <div class="font-weight-bold">
                                        <div class="text-truncate">Hi there! I am wondering if you can help me with a
                                            problem I've been having.</div>
                                        <div class="small text-gray-500">Emily Fowler · 58m</div>
                                    </div>
                                </a>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle" src="/resources/assets/img/undraw_profile_2.svg"
                                            alt="...">
                                        <div class="status-indicator"></div>
                                    </div>
                                    <div>
                                        <div class="text-truncate">I have the photos that you ordered last month, how
                                            would you like them sent to you?</div>
                                        <div class="small text-gray-500">Jae Chun · 1d</div>
                                    </div>
                                </a>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle" src="/resources/assets/img/undraw_profile_3.svg"
                                            alt="...">
                                        <div class="status-indicator bg-warning"></div>
                                    </div>
                                    <div>
                                        <div class="text-truncate">Last month's report looks great, I am very happy with
                                            the progress so far, keep up the good work!</div>
                                        <div class="small text-gray-500">Morgan Alvarez · 2d</div>
                                    </div>
                                </a>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle" src="https://source.unsplash.com/Mv9hjnEUHR4/60x60"
                                            alt="...">
                                        <div class="status-indicator bg-success"></div>
                                    </div>
                                    <div>
                                        <div class="text-truncate">Am I a good boy? The reason I ask is because someone
                                            told me that people say this to all dogs, even if they aren't good...</div>
                                        <div class="small text-gray-500">Chicken the Dog · 2w</div>
                                    </div>
                                </a>
                                <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>
                            </div>
                        </li>

                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Douglas McGee</span>
                                <img class="img-profile rounded-circle"
                                    src="/resources/assets/img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Activity Log
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
                        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                                class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
                    </div>

                    <!-- Content Row -->
                    <div class="row">

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
                                                Earnings (Monthly)</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">$40,000</div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-calendar fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-success shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                Earnings (Annual)</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">$215,000</div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-info shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-info text-uppercase mb-1">Tasks
                                            </div>
                                            <div class="row no-gutters align-items-center">
                                                <div class="col-auto">
                                                    <div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">50%</div>
                                                </div>
                                                <div class="col">
                                                    <div class="progress progress-sm mr-2">
                                                        <div class="progress-bar bg-info" role="progressbar"
                                                            style="width: 50%" aria-valuenow="50" aria-valuemin="0"
                                                            aria-valuemax="100"></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pending Requests Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-warning shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-warning text-uppercase mb-1">
                                                Pending Requests</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">18</div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-comments fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Content Row -->

                    <div class="row">

                        <!-- Area Chart -->
                        <div class="col-xl-12 col-lg-7">
                            <div class="card shadow mb-4">


                                <!-- Card Header - Dropdown -->
                                <div
                                    class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-primary">Activity Analysis</h6>
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>
                                        <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                            aria-labelledby="dropdownMenuLink">
                                            <div class="dropdown-header">Dropdown Header:</div>
                                            <a class="dropdown-item" href="#">Action</a>
                                            <a class="dropdown-item" href="#">Another action</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Something else here</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-area">
                                    <div class="card-body">
    <div class="scroll-container" style="width: 100%; height: 300px; overflow: auto;">
        <div class="scrollmenu" style="white-space: nowrap;">

            <table class="table table-bordered table-sm ">
                <thead class="thead-dark">
                    <tr>
                        <th>User</th>
                        <th>WorkSchedule</th>
                        <th>logged_in_Time</th>
                        <th>IdleTime</th>
                        <th>ActimeTime</th>
                        <th>Activity_chart</th>
                        <th>Score</th>
                        <th>Rank</th>
                        <th>Timeline</th>
                        <th>ScreenShots</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="clickable" data-toggle="collapse" data-target="#group-of-rows-1" aria-expanded="false" aria-controls="group-of-rows-1">
                         <td><i class="fa fa-folder"></i></td>
                        <td></td>
                        <!-- <td>WorkSchedule</td>
                        <td>logged_in_Time</td>
                        <td>IdleTime</td>
                        <td>Active Time</td>
                        <td>Activity Charts</td>
                        <td>Score</td>
                        <td>Rank</td>
                        <td>Timeline</td>
                        <td>ScreenShots</td> -->
                        
                    </tr>
                </tbody>
                <tbody id="group-of-rows-1" class="collapse">
                    <tr class="table-warning">
                         <!-- <td><i class="fa fa-folder-open"></i>Week</td> -->
                        <!-- <td>data 1</td>
                        <td>data 1</td>
                        <td>data 1</td> -->
                    </tr>
                    <!-- <tr class="table-warning">
                        <td><i class="fa fa-folder-open"></i> child row</td>
                        <td>data 1</td>
                        <td>data 1</td>
                        <td>data 1</td>
                    </tr> -->
                </tbody>
                <tbody>
                    <tr class="clickable" data-toggle="collapse" data-target="#group-of-rows-2" aria-expanded="false" aria-controls="group-of-rows-2">
                         <!-- <td><i class="fa fa-folder"></i></td> -->
                         
                        <td>Date</td>
                        <td>logged_in_Time</td>
                        <td>IdleTime</td>
                        <td>Active_time</td>
                        <td>Activity_chart</td>
                        <td>Score</td>
                        <td>Rank</td>
                        <td>Timeline</td>
                        <td>ScreensShots</td>
                        <!-- <td>WorkSchedule</td> -->
                    </tr>
                </tbody>
                <tbody id="group-of-rows-2" class="collapse">
                    <!-- <td><button>Attendance</button></td> -->
                     <tr class="table-warning">
                        <!-- <td><i class="fa fa-folder-open"></i> Attendance Data</td> -->
                         <!-- <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td>  -->
                    </tr> 
                    <tr class="table-warning">
                        <!-- <td><i class="fa fa-folder-open"></i> Current Day</td> -->
                        <!-- <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td>  -->
                    </tr>
                    <tr class="table-warning">
                        <!-- <td><i class="fa fa-folder-open"></i> Current Day</td> -->
                        <!-- <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td>  -->
                    </tr>
                    <tr class="table-warning">
                        <!-- <td><i class="fa fa-folder-open"></i> Current Day</td> -->
                        <!-- <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td>  -->
                    </tr>
                    <tr class="table-warning">
                        <!-- <td><i class="fa fa-folder-open"></i> Current Day</td> -->
                        <!-- <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td> 
                        <td>data 2</td>
                        <td>data 2</td>
                        <td>data 2</td>  -->
                    </tr>

                </tbody>
            </table>
            
        </div>
    </div>
</div>
                                        <canvas id="myBarChart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pie Chart -->
                        <div class="col-xl-4 col-lg-5">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div
                                    class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-primary">User Activity</h6>
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>
                                        <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                            aria-labelledby="dropdownMenuLink">
                                            <div class="dropdown-header">Dropdown Header:</div>
                                            <a class="dropdown-item" href="#">Action</a>
                                            <a class="dropdown-item" href="#">Another action</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Something else here</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-pie pt-4 pb-2">
                                        <canvas id="myPieChart"></canvas>
                                    </div>
                                    <div class="mt-4 text-center small">
                                        <span class="mr-2">
                                            <i class="fas fa-circle text-primary"></i> Online Hours
                                        </span>
                                        <span class="mr-2">
                                            <i class="fas fa-circle text-success"></i> User Id
                                        </span>
                                        <span class="mr-2">
                                            <i class="fas fa-circle text-info"></i> Idle Time
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Content Row -->
                    <div class="row">
<!-- Content Column -->
                      

                            <!-- Project Card Example -->
                            <div class="card shadow mb-4">
                               
                               

                            

                        </div>

                           
                             <div class="col-lg-6 mb-4">
        
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script> 
 
  <script>


//  document.addEventListener("DOMContentLoaded", function() {
//       var expandableRows = document.getElementsByClassName("expandable-row");

//       for (var i = 0; i < expandableRows.length; i++) {
//         expandableRows[i].addEventListener("click", function() {
//           var targetId = this.getAttribute("data-toggle");
//           toggleRow(targetId);
//         });
//       }
//     });

//     function toggleRow(targetId) {
//       var nestedRow = document.querySelector(".nested-row." + targetId);
//       var nestedTable = nestedRow.querySelector(".nested-table");
//       var toggleButton = nestedRow.querySelector(".toggle-button");

//       if (nestedTable.style.display === "" || nestedTable.style.display === "none") {
//         nestedTable.style.display = "table";
//         toggleButton.textContent = "Collapse";
//       } else {
//         nestedTable.style.display = "none";
//         toggleButton.textContent = "Expand";
//       }
//     }

 let fetchedData; 

fetch('/api/Details/7') 
  .then(response => response.json())
  .then(data => {
    fetchedData = data; 
    if (fetchedData) {
// if (Array.isArray(fetchedData)) {
 const tableBody = document.getElementById('group-of-rows-1');
//  fetchedData.forEach(data => {
    debugger
   const itemfullName = data.fullName;
   const itemWorkSchedule = data.WorkSchedule;
   const itemLoggedInTime = data.activeLogIn;
   const itemIdleTime = data.idleTime;
   const itemActiveTime = data.activeTime;
   const itemActivitycharts = data.activity_chart;
   const itemScore = data.score;
   const itemRank = data.rank;
   const itemTimeLine = data.timeline;
   const itemScreensShots = data.screensShots;
   
   
   const row = document.createElement('tr');

   const tdItemFullName = document.createElement('td');
   tdItemFullName.textContent = itemfullName;

   const tdItemWorkSchedule = document.createElement('td');
   tdItemWorkSchedule.textContent = itemWorkSchedule;

   const tdItemLoggedInTime  = document.createElement('td');
   tdItemLoggedInTime.textContent = itemLoggedInTime;
   
   const tdItemIdleTime = document.createElement('td');
   tdItemIdleTime.textContent = itemIdleTime;
   
   const tdItemActiveTime = document.createElement('td');
   tdItemActiveTime.textContent = itemActiveTime;
   
   const tdItemActivityCharts = document.createElement('td');
   tdItemActivityCharts.textContent = itemActivitycharts;
   
   const tdItemScore = document.createElement('td');
   tdItemScore.textContent = itemScore;
   
   const tdItemRank = document.createElement('td');
   tdItemRank.textContent = itemRank;
   
   const tdItemTimeline = document.createElement('td');
   tdItemTimeline.textContent = itemTimeLine;

   const tdItemScreensshots = document.createElement('td');
   tdItemScreensshots.textContent = itemScreensShots;
   
  
   row.appendChild(tdItemFullName);
   row.appendChild(tdItemWorkSchedule);
   row.appendChild(tdItemLoggedInTime);
   row.appendChild(tdItemIdleTime);
   row.appendChild(tdItemActiveTime);
   row.appendChild(tdItemActivityCharts);
   row.appendChild(tdItemScore);
   row.appendChild(tdItemRank);
   row.appendChild(tdItemTimeline);
   row.appendChild(tdItemScreensshots);
  
   
   tableBody.appendChild(row);
//  });
}
         else {
          console.error('fetchedData is not an array or is empty.');
        }
    }
    //  else {
    //     const noDataMessage = document.createElement('tr');
    //     noDataMessage.innerHTML = `<td colspan="4">No data available</td>`;
    //     tableBody.appendChild(noDataMessage);
    // }
    
  )
  .catch(error => {
    console.error('Error fetching data:', error);
  });

document.addEventListener("DOMContentLoaded", function () {
    fetch('/api/Details/7')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            console.log('Fetched data:', data); 
            
            

           
        })
        .catch(error => {
            console.error('Error fetching data:', error); 
            
            const tableBody = document.querySelector('#titleTable tbody');
            const errorMessage = document.createElement('tr');
            errorMessage.innerHTML = `<td colspan="4">Error fetching data</td>`;
            tableBody.appendChild(errorMessage);
        });
});





let fetchedDatas; 

fetch('/api/OneDay/7') 
  .then(response => response.json())
  .then(data => {
    fetchedDatas = data; 
    if (fetchedDatas) {
// if (Array.isArray(fetchedData)) {
 const tableBody = document.getElementById('group-of-rows-2');
//  fetchedData.forEach(data => {
  debugger
   const itemDate = data.date;
   const itemLoggedInTime = data.loginTime;
   const itemIdleTime = data.idletime;
   const itemActiveTime = data.activetime;
   const itemActivitycharts = data.activity_chart;
   const itemScore = data.score;
   const itemRank = data.rank;
   const itemTimeLine = data.timeline;
   const itemScreensShots = data.screensShots;
   const WorkSchedule = data.WorkSchedule;
   
   
   const row = document.createElement('tr');

   const tdItemDate1 = document.createElement('td');
   tdItemDate1.textContent = itemDate;

//    const tdItemWorkSchedule = document.createElement('td');
//    tdItemWorkSchedule.textContent = itemWorkSchedule;

   const tdItemLoggedInTime1  = document.createElement('td');
   tdItemLoggedInTime1.textContent = itemLoggedInTime;
   
   const tdItemIdleTime1 = document.createElement('td');
   tdItemIdleTime1.textContent = itemIdleTime;
   
   const tdItemActiveTime1 = document.createElement('td');
   tdItemActiveTime1.textContent = itemActiveTime;
   
   const tdItemActivityCharts1 = document.createElement('td');
   tdItemActivityCharts1.textContent = itemActivitycharts;
   
   const tdItemScore1 = document.createElement('td');
   tdItemScore1.textContent = itemScore;
   
   const tdItemRank1 = document.createElement('td');
   tdItemRank1.textContent = itemRank;
   
   const tdItemTimeline1 = document.createElement('td');
   tdItemTimeline1.textContent = itemTimeLine;

   const tdItemScreensshots1 = document.createElement('td');
   tdItemScreensshots1.textContent = itemScreensShots;
   
  
   row.appendChild(tdItemDate1);
//   row.appendChild(tdItemWorkSchedule);
   row.appendChild(tdItemLoggedInTime1);
   row.appendChild(tdItemIdleTime1);
   row.appendChild(tdItemActiveTime1);
   row.appendChild(tdItemActivityCharts1);
   row.appendChild(tdItemScore1);
   row.appendChild(tdItemRank1);
   row.appendChild(tdItemTimeline1);
   row.appendChild(tdItemScreensshots1);
//    row.appendChild(tdItemWorkSchedule);
   
   tableBody.appendChild(row);
//  });
}
         else {
          console.error('fetchedDatas is not an array or is empty.');
        }
    }
    //  else {
    //     const noDataMessage = document.createElement('tr');
    //     noDataMessage.innerHTML = `<td colspan="4">No data available</td>`;
    //     tableBody.appendChild(noDataMessage);
    // }
    
  )
  .catch(error => {
    console.error('Error fetching data:', error);
  });

document.addEventListener("DOMContentLoaded", function () {
    fetch('/api/OneDay/7')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            console.log('Fetched data:', data); 
            
            

           
        })
        .catch(error => {
            console.error('Error fetching data:', error); 
            
            const tableBody = document.querySelector('#titleTable tbody');
            const errorMessage = document.createElement('tr');
            errorMessage.innerHTML = `<td colspan="4">Error fetching data</td>`;
            tableBody.appendChild(errorMessage);
        });
});







</script>


     <!-- Approach -->
                            <div class="card shadow mb-4">
                                
                            </div>

                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2021</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.jsp">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="/resources/assets/vendor/jquery/jquery.min.js"></script>
    <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/resources/assets/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/resources/assets/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="/resources/assets/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="/resources/assets/js/demo/chart-area-demo.js"></script>
    <script src="/resources/assets/js/demo/chart-pie-demo.js"></script>

</body>

</html>