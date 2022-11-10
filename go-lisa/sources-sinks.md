
# Sources Go API

| Package | Function Signature |
|---|---|
| syscall | Mprotect([]uint8,  int) error |
| syscall | Sync() error |
| syscall | GetsockoptByte(int,  int,  int) uint8,  erroruint8,  error(uint8,  erroruint8,  error) |
| syscall | LsfJump(int,  int,  int,  int) \*SockFilter |
| syscall | Sendmsg(int,  []uint8,  []uint8,  Sockaddr,  int) error |
| syscall | DnsQuery(string,  uint16,  uint32,  \*uint8,  \*\*DNSRecord,  \*uint8) error |
| syscall | SetsockoptIPv6Mreq(Handle,  int,  int,  \*IPv6Mreq) error |
| syscall | Fchdir(Handle) error |
| syscall | OpenProcessToken(Handle,  uint32,  \*Token) error |
| syscall | Getpeername(Handle) Sockaddr,  errorSockaddr,  error(Sockaddr,  errorSockaddr,  error) |
| syscall | SetsockoptIPMreq(Handle,  int,  int,  \*IPMreq) error |
| syscall | ReadDirectoryChanges(Handle,  \*uint8,  uint32,  bool,  uint32,  \*uint32,  \*Overlapped,  uintptr) error |
| syscall | LookupAccountName(\*uint16,  \*uint16,  \*SID,  \*uint32,  \*uint16,  \*uint32,  \*uint32) error |
| syscall | RawSyscall6(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | Closesocket(Handle) error |
| syscall | Setresuid(int,  int,  int) error |
| syscall | InotifyAddWatch(int,  string,  uint32) int,  errorint,  error(int,  errorint,  error) |
| syscall | Getdirentries(int,  []uint8,  \*uintptr) int,  errorint,  error(int,  errorint,  error) |
| syscall | Setlogin(string) error |
| syscall | PtraceCont(int,  int) error |
| syscall | GetEnvironmentVariable(\*uint16,  \*uint16,  uint32) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | SetBpfInterface(int,  string) error |
| syscall | Write(Handle,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | GetStartupInfo(\*StartupInfo) error |
| syscall | SysctlUint32(string) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Setfsuid(int) error |
| syscall | ConvertSidToStringSid(\*SID,  \*\*uint16) error |
| syscall | PostQueuedCompletionStatus(Handle,  uint32,  uint32,  \*Overlapped) error |
| syscall | Fchownat(int,  string,  int,  int,  int) error |
| syscall | CertFreeCertificateContext(\*CertContext) error |
| syscall | Ioperm(int,  int,  int) error |
| syscall | Pipe([]int) error |
| syscall | RegCloseKey(Handle) error |
| syscall | ReadDirent(int,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | FindFirstFile(\*uint16,  \*Win32finddata) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Syscall(uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | Setsid() int,  errorint,  error(int,  errorint,  error) |
| syscall | CreateDirectory(\*uint16,  \*SecurityAttributes) error |
| syscall | Getpgrp() int |
| syscall | Pipe([]Handle) error |
| syscall | Sendto(int,  []uint8,  int,  Sockaddr) error |
| syscall | Pathconf(string,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | NsecToTimeval(int64) Timeval |
| syscall | BpfJump(int,  int,  int,  int) \*BpfInsn |
| syscall | ConvertStringSidToSid(\*uint16,  \*\*SID) error |
| syscall | StringToUTF16Ptr(string) \*uint16 |
| syscall | StringByteSlice(string) []uint8 |
| syscall | Recvfrom(Handle,  []uint8,  int) int,  Sockaddr,  errorint,  Sockaddr,  error(int,  Sockaddr,  errorint,  Sockaddr,  error) |
| syscall | GetsockoptInt(int,  int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | CertCloseStore(Handle,  uint32) error |
| syscall | Getpgid(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Flock(int,  int) error |
| syscall | FindNextFile(Handle,  \*Win32finddata) error |
| syscall | GetTimeZoneInformation(\*Timezoneinformation) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Environ() []string |
| syscall | WSAIoctl(Handle,  uint32,  \*uint8,  uint32,  \*uint8,  uint32,  \*uint32,  \*Overlapped,  uintptr) error |
| syscall | Access(string,  uint32) error |
| syscall | Listen(int,  int) error |
| syscall | Socketpair(int,  int,  int) [2]int,  error[2]int,  error([2]int,  error[2]int,  error) |
| syscall | SetsockoptInt(int,  int,  int,  int) error |
| syscall | RegQueryValueEx(Handle,  \*uint16,  \*uint32,  \*uint32,  \*uint8,  \*uint32) error |
| syscall | Fchdir(int) error |
| syscall | Gettimeofday(\*Timeval) error |
| syscall | GetTokenInformation(Token,  uint32,  \*uint8,  uint32,  \*uint32) error |
| syscall | OpenProcess(uint32,  bool,  uint32) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | SetsockoptTimeval(Handle,  int,  int,  \*Timeval) error |
| syscall | CopySid(uint32,  \*SID,  \*SID) error |
| syscall | GetQueuedCompletionStatus(Handle,  \*uint32,  \*uint32,  \*\*Overlapped,  uint32) error |
| syscall | WSASendto(Handle,  \*WSABuf,  uint32,  \*uint32,  uint32,  Sockaddr,  \*Overlapped,  \*uint8) error |
| syscall | PtracePokeData(int,  uintptr,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | LsfSocket(int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Klogctl(int,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | Getpeername(int) Sockaddr,  errorSockaddr,  error(Sockaddr,  errorSockaddr,  error) |
| syscall | Kill(int,  Signal) error |
| syscall | SetBpfImmediate(int,  int) error |
| syscall | Read(int,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | NewCallback(interface{}) uintptr |
| syscall | Setreuid(int,  int) error |
| syscall | NetUserGetInfo(\*uint16,  \*uint16,  uint32,  \*\*uint8) error |
| syscall | Shutdown(Handle,  int) error |
| syscall | GetUserNameEx(uint32,  \*uint16,  \*uint32) error |
| syscall | Open(string,  int,  uint32) int,  errorint,  error(int,  errorint,  error) |
| syscall | Getrlimit(int,  \*Rlimit) error |
| syscall | ParseUnixRights(\*SocketControlMessage) []int,  error[]int,  error([]int,  error[]int,  error) |
| syscall | Wait4(int,  \*WaitStatus,  int,  \*Rusage) int,  errorint,  error(int,  errorint,  error) |
| syscall | Undelete(string) error |
| syscall | FlushFileBuffers(Handle) error |
| syscall | Syscall6(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | SetsockoptString(int,  int,  int,  string) error |
| syscall | Chflags(string,  int) error |
| syscall | CreatePipe(\*Handle,  \*Handle,  \*SecurityAttributes,  uint32) error |
| syscall | Close(int) error |
| syscall | RouteRIB(int,  int) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| syscall | SetBpf(int,  []BpfInsn) error |
| syscall | PtraceSetOptions(int,  int) error |
| syscall | Socket(int,  int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | MoveFile(\*uint16,  \*uint16) error |
| syscall | TimevalToNsec(Timeval) int64 |
| syscall | Getrusage(int,  \*Rusage) error |
| syscall | Tgkill(int,  int,  Signal) error |
| syscall | SetBpfDatalink(int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Getwd() string,  errorstring,  error(string,  errorstring,  error) |
| syscall | Setregid(int,  int) error |
| syscall | SetCurrentDirectory(\*uint16) error |
| syscall | PivotRoot(string,  string) error |
| syscall | CreateIoCompletionPort(Handle,  Handle,  uint32,  uint32) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | SetsockoptInet4Addr(Handle,  int,  int,  [4]uint8) error |
| syscall | TranslateName(\*uint16,  uint32,  uint32,  \*uint16,  \*uint32) error |
| syscall | Chmod(string,  uint32) error |
| syscall | UTF16ToString([]uint16) string |
| syscall | DuplicateHandle(Handle,  Handle,  Handle,  \*Handle,  uint32,  bool,  uint32) error |
| syscall | Setfsgid(int) error |
| syscall | SetsockoptLinger(int,  int,  int,  \*Linger) error |
| syscall | LoadLibrary(string) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Ustat(int,  \*Ustat_t) error |
| syscall | AttachLsf(int,  []SockFilter) error |
| syscall | Fsync(Handle) error |
| syscall | GetFullPathName(\*uint16,  uint32,  \*uint16,  \*\*uint16) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | SyncFileRange(int,  int64,  int64,  int) error |
| syscall | Ftruncate(int,  int64) error |
| syscall | CertAddCertificateContextToStore(Handle,  \*CertContext,  uint32,  \*\*CertContext) error |
| syscall | Mkfifo(string,  uint32) error |
| syscall | GetCurrentProcess() Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | GetFileType(Handle) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | GetProcAddress(Handle,  string) uintptr,  erroruintptr,  error(uintptr,  erroruintptr,  error) |
| syscall | SetsockoptByte(int,  int,  int,  uint8) error |
| syscall | Mlockall(int) error |
| syscall | Syscall6(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | GetFileAttributes(\*uint16) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Issetugid() bool |
| syscall | Getpriority(int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | FreeEnvironmentStrings(\*uint16) error |
| syscall | Dup(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | LocalFree(Handle) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Renameat(int,  string,  int,  string) error |
| syscall | NsecToFiletime(int64) Filetime |
| syscall | Syscall9(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | GetTempPath(uint32,  \*uint16) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Chdir(string) error |
| syscall | GetProtoByName(string) \*Protoent,  error\*Protoent,  error(\*Protoent,  error\*Protoent,  error) |
| syscall | Creat(string,  uint32) int,  errorint,  error(int,  errorint,  error) |
| syscall | Munlock([]uint8) error |
| syscall | GetAdaptersInfo(\*IpAdapterInfo,  \*uint32) error |
| syscall | CreateProcess(\*uint16,  \*uint16,  \*SecurityAttributes,  \*SecurityAttributes,  bool,  uint32,  \*uint16,  \*uint16,  \*StartupInfo,  \*ProcessInformation) error |
| syscall | WSASendTo(Handle,  \*WSABuf,  uint32,  \*uint32,  uint32,  \*RawSockaddrAny,  int32,  \*Overlapped,  \*uint8) error |
| syscall | GetEnvironmentStrings() \*uint16,  error\*uint16,  error(\*uint16,  error\*uint16,  error) |
| syscall | Seteuid(int) error |
| syscall | WSARecvFrom(Handle,  \*WSABuf,  uint32,  \*uint32,  \*uint32,  \*RawSockaddrAny,  \*int32,  \*Overlapped,  \*uint8) error |
| syscall | Gettid() int |
| syscall | Socket(int,  int,  int) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Unlink(string) error |
| syscall | LoadDLL(string) \*DLL,  error\*DLL,  error(\*DLL,  error\*DLL,  error) |
| syscall | Accept(Handle) Handle,  Sockaddr,  errorHandle,  Sockaddr,  error(Handle,  Sockaddr,  errorHandle,  Sockaddr,  error) |
| syscall | TimespecToNsec(Timespec) int64 |
| syscall | SetsockoptIPMreq(int,  int,  int,  \*IPMreq) error |
| syscall | Bind(int,  Sockaddr) error |
| syscall | GetIfEntry(\*MibIfRow) error |
| syscall | CryptAcquireContext(\*Handle,  \*uint16,  \*uint16,  uint32,  uint32) error |
| syscall | Sendfile(int,  int,  \*int64,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | OpenCurrentProcessToken() Token,  errorToken,  error(Token,  errorToken,  error) |
| syscall | FlushViewOfFile(uintptr,  uintptr) error |
| syscall | GetsockoptIPMreqn(int,  int,  int) \*IPMreqn,  error\*IPMreqn,  error(\*IPMreqn,  error\*IPMreqn,  error) |
| syscall | Truncate(string,  int64) error |
| syscall | Setpriority(int,  int,  int) error |
| syscall | GetExitCodeProcess(Handle,  \*uint32) error |
| syscall | GetLongPathName(\*uint16,  \*uint16,  uint32) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Recvfrom(int,  []uint8,  int) int,  Sockaddr,  errorint,  Sockaddr,  error(int,  Sockaddr,  errorint,  Sockaddr,  error) |
| syscall | Sethostname([]uint8) error |
| syscall | SetNonblock(Handle,  bool) error |
| syscall | SetHandleInformation(Handle,  uint32,  uint32) error |
| syscall | Pipe2([]int,  int) error |
| syscall | CryptGenRandom(Handle,  uint32,  \*uint8) error |
| syscall | Unlinkat(int,  string) error |
| syscall | Mkdirat(int,  string,  uint32) error |
| syscall | Madvise([]uint8,  int) error |
| syscall | SetEnvironmentVariable(\*uint16,  \*uint16) error |
| syscall | Setresgid(int,  int,  int) error |
| syscall | GetHostByName(string) \*Hostent,  error\*Hostent,  error(\*Hostent,  error\*Hostent,  error) |
| syscall | PtraceSingleStep(int) error |
| syscall | UnixCredentials(\*Ucred) []uint8 |
| syscall | GetsockoptIPMreq(int,  int,  int) \*IPMreq,  error\*IPMreq,  error(\*IPMreq,  error\*IPMreq,  error) |
| syscall | Adjtime(\*Timeval,  \*Timeval) error |
| syscall | Iopl(int) error |
| syscall | Exec(string,  []string,  []string) error |
| syscall | RegQueryInfoKey(Handle,  \*uint16,  \*uint32,  \*uint32,  \*uint32,  \*uint32,  \*uint32,  \*uint32,  \*uint32,  \*uint32,  \*uint32,  \*Filetime) error |
| syscall | Fchown(int,  int,  int) error |
| syscall | Kqueue() int,  errorint,  error(int,  errorint,  error) |
| syscall | Lchown(string,  int,  int) error |
| syscall | EpollWait(int,  []EpollEvent,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | StringToUTF16(string) []uint16 |
| syscall | DetachLsf(int) error |
| syscall | Setpgid(int,  int) error |
| syscall | Getenv(string) string,  boolstring,  bool(string,  boolstring,  bool) |
| syscall | CmsgLen(int) int |
| syscall | StringBytePtr(string) \*uint8 |
| syscall | Getegid() int |
| syscall | Select(int,  \*FdSet,  \*FdSet,  \*FdSet,  \*Timeval) error |
| syscall | Getfsstat([]Statfs_t,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | GetLastError() error |
| syscall | Uname(\*Utsname) error |
| syscall | EpollCreate(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Getuid() int |
| syscall | BpfTimeout(int) \*Timeval,  error\*Timeval,  error(\*Timeval,  error\*Timeval,  error) |
| syscall | CreateFile(\*uint16,  uint32,  uint32,  \*SecurityAttributes,  uint32,  uint32,  int32) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Mkdir(string,  uint32) error |
| syscall | Connect(int,  Sockaddr) error |
| syscall | Syscall15(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | GetsockoptInet4Addr(int,  int,  int) [4]uint8,  error[4]uint8,  error([4]uint8,  error[4]uint8,  error) |
| syscall | Faccessat(int,  string,  uint32,  int) error |
| syscall | Acct(string) error |
| syscall | CertOpenStore(uintptr,  uint32,  uintptr,  uint32,  uintptr) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | GetServByName(string,  string) \*Servent,  error\*Servent,  error(\*Servent,  error\*Servent,  error) |
| syscall | Pread(int,  []uint8,  int64) int,  errorint,  error(int,  errorint,  error) |
| syscall | CreateFileMapping(Handle,  \*SecurityAttributes,  uint32,  uint32,  uint32,  \*uint16) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | ParseRoutingSockaddr(RoutingMessage) []Sockaddr,  error[]Sockaddr,  error([]Sockaddr,  error[]Sockaddr,  error) |
| syscall | Sysinfo(\*Sysinfo_t) error |
| syscall | Splice(int,  \*int64,  int,  \*int64,  int,  int) int64,  errorint64,  error(int64,  errorint64,  error) |
| syscall | Fchmod(Handle,  uint32) error |
| syscall | Setdomainname([]uint8) error |
| syscall | Close(Handle) error |
| syscall | ReadFile(Handle,  []uint8,  \*uint32,  \*Overlapped) error |
| syscall | FlushBpf(int) error |
| syscall | CertCreateCertificateContext(uint32,  \*uint8,  uint32) \*CertContext,  error\*CertContext,  error(\*CertContext,  error\*CertContext,  error) |
| syscall | Write(int,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | NewLazyDLL(string) \*LazyDLL |
| syscall | Fpathconf(int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Mount(string,  string,  string,  uintptr,  string) error |
| syscall | Stat(string,  \*Stat_t) error |
| syscall | MapViewOfFile(Handle,  uint32,  uint32,  uint32,  uintptr) uintptr,  erroruintptr,  error(uintptr,  erroruintptr,  error) |
| syscall | Getsid(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | BpfHeadercmpl(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Times(\*Tms) uintptr,  erroruintptr,  error(uintptr,  erroruintptr,  error) |
| syscall | Openat(int,  string,  int,  uint32) int,  errorint,  error(int,  errorint,  error) |
| syscall | Setenv(string,  string) error |
| syscall | BpfInterface(int,  string) string,  errorstring,  error(string,  errorstring,  error) |
| syscall | ParseUnixCredentials(\*SocketControlMessage) \*Ucred,  error\*Ucred,  error(\*Ucred,  error\*Ucred,  error) |
| syscall | Syscall(uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | InotifyInit() int,  errorint,  error(int,  errorint,  error) |
| syscall | Chown(string,  int,  int) error |
| syscall | SetBpfPromisc(int,  int) error |
| syscall | GetUserProfileDirectory(Token,  \*uint16,  \*uint32) error |
| syscall | UnmapViewOfFile(uintptr) error |
| syscall | CertGetCertificateChain(Handle,  \*CertContext,  \*Filetime,  Handle,  \*CertChainPara,  uint32,  uintptr,  \*\*CertChainContext) error |
| syscall | GetVersion() uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | NsecToTimespec(int64) Timespec |
| syscall | StringSlicePtr([]string) []\*uint8 |
| syscall | RemoveDirectory(\*uint16) error |
| syscall | Recvmsg(int,  []uint8,  []uint8,  int) int,  int,  int,  Sockaddr,  errorint,  int,  int,  Sockaddr,  error(int,  int,  int,  Sockaddr,  errorint,  int,  int,  Sockaddr,  error) |
| syscall | Futimes(int,  []Timeval) error |
| syscall | Lstat(string,  \*Stat_t) error |
| syscall | Fchflags(string,  int) error |
| syscall | TerminateProcess(Handle,  uint32) error |
| syscall | StringToSid(string) \*SID,  error\*SID,  error(\*SID,  error\*SID,  error) |
| syscall | BpfStmt(int,  int) \*BpfInsn |
| syscall | Link(string,  string) error |
| syscall | Time(\*Time_t) Time_t,  errorTime_t,  error(Time_t,  errorTime_t,  error) |
| syscall | Getdtablesize() int |
| syscall | CheckBpfVersion(int) error |
| syscall | GetCommandLine() \*uint16 |
| syscall | NetlinkRIB(int,  int) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| syscall | GetComputerName(\*uint16,  \*uint32) error |
| syscall | Open(string,  int,  uint32) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Settimeofday(\*Timeval) error |
| syscall | ParseNetlinkRouteAttr(\*NetlinkMessage) []NetlinkRouteAttr,  error[]NetlinkRouteAttr,  error([]NetlinkRouteAttr,  error[]NetlinkRouteAttr,  error) |
| syscall | Setegid(int) error |
| syscall | SetsockoptLinger(Handle,  int,  int,  \*Linger) error |
| syscall | TranslateAccountName(string,  uint32,  uint32,  int) string,  errorstring,  error(string,  errorstring,  error) |
| syscall | Rename(string,  string) error |
| syscall | SetEndOfFile(Handle) error |
| syscall | SetsockoptInt(Handle,  int,  int,  int) error |
| syscall | Fdatasync(int) error |
| syscall | Mknodat(int,  string,  uint32,  int) error |
| syscall | Munlockall() error |
| syscall | SetsockoptIPMreqn(int,  int,  int,  \*IPMreqn) error |
| syscall | Pwrite(int,  []uint8,  int64) int,  errorint,  error(int,  errorint,  error) |
| syscall | LsfStmt(int,  int) \*SockFilter |
| syscall | SetFilePointer(Handle,  int32,  \*int32,  uint32) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Umask(int) int |
| syscall | Fchown(Handle,  int,  int) error |
| syscall | PtraceSetRegs(int,  \*PtraceRegs) error |
| syscall | Read(Handle,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | PtracePeekText(int,  uintptr,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | Chroot(string) error |
| syscall | PtraceAttach(int) error |
| syscall | Seek(int,  int64,  int) int64,  errorint64,  error(int64,  errorint64,  error) |
| syscall | GetsockoptIPv6Mreq(int,  int,  int) \*IPv6Mreq,  error\*IPv6Mreq,  error(\*IPv6Mreq,  error\*IPv6Mreq,  error) |
| syscall | Shutdown(int,  int) error |
| syscall | Sendto(Handle,  []uint8,  int,  Sockaddr) error |
| syscall | Unshare(int) error |
| syscall | GetShortPathName(\*uint16,  \*uint16,  uint32) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | LookupSID(string,  string) \*SID,  string,  uint32,  error\*SID,  string,  uint32,  error(\*SID,  string,  uint32,  error\*SID,  string,  uint32,  error) |
| syscall | EpollCtl(int,  int,  int,  \*EpollEvent) error |
| syscall | Utimes(string,  []Timeval) error |
| syscall | Nanosleep(\*Timespec,  \*Timespec) error |
| syscall | PtraceGetRegs(int,  \*PtraceRegs) error |
| syscall | TransmitFile(Handle,  Handle,  uint32,  uint32,  \*Overlapped,  \*TransmitFileBuffers,  uint32) error |
| syscall | EpollCreate1(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Listen(Handle,  int) error |
| syscall | WSARecv(Handle,  \*WSABuf,  uint32,  \*uint32,  \*uint32,  \*Overlapped,  \*uint8) error |
| syscall | BpfStats(int) \*BpfStat,  error\*BpfStat,  error(\*BpfStat,  error\*BpfStat,  error) |
| syscall | Fchmodat(int,  string,  uint32,  int) error |
| syscall | Reboot(int) error |
| syscall | PtraceDetach(int) error |
| syscall | BpfDatalink(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | GetProcessTimes(Handle,  \*Filetime,  \*Filetime,  \*Filetime,  \*Filetime) error |
| syscall | PtracePokeText(int,  uintptr,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | Setrlimit(int,  \*Rlimit) error |
| syscall | Setgid(int) error |
| syscall | InotifyRmWatch(int,  uint32) int,  errorint,  error(int,  errorint,  error) |
| syscall | Syscall12(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | Setuid(int) error |
| syscall | ParseNetlinkMessage([]uint8) []NetlinkMessage,  error[]NetlinkMessage,  error([]NetlinkMessage,  error[]NetlinkMessage,  error) |
| syscall | DeleteFile(\*uint16) error |
| syscall | StartProcess(string,  []string,  \*ProcAttr) int,  uintptr,  errorint,  uintptr,  error(int,  uintptr,  errorint,  uintptr,  error) |
| syscall | Dup2(int,  int) error |
| syscall | UnixRights(...int) []uint8 |
| syscall | Getsockname(int) Sockaddr,  errorSockaddr,  error(Sockaddr,  errorSockaddr,  error) |
| syscall | NetApiBufferFree(\*uint8) error |
| syscall | GetFileAttributesEx(\*uint16,  uint32,  \*uint8) error |
| syscall | WSAStartup(uint32,  \*WSAData) error |
| syscall | CommandLineToArgv(\*uint16,  \*int32) \*[8192]\*[8192]uint16,  error\*[8192]\*[8192]uint16,  error(\*[8192]\*[8192]uint16,  error\*[8192]\*[8192]uint16,  error) |
| syscall | VirtualUnlock(uintptr,  uintptr) error |
| syscall | ComputerName() string,  errorstring,  error(string,  errorstring,  error) |
| syscall | ParseSocketControlMessage([]uint8) []SocketControlMessage,  error[]SocketControlMessage,  error([]SocketControlMessage,  error[]SocketControlMessage,  error) |
| syscall | Readlink(string,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | SetLsfPromisc(string,  bool) error |
| syscall | Getpid() int |
| syscall | GetStdHandle(int) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | Setgroups([]int) error |
| syscall | ForkExec(string,  []string,  \*ProcAttr) int,  errorint,  error(int,  errorint,  error) |
| syscall | MustLoadDLL(string) \*DLL |
| syscall | Rmdir(string) error |
| syscall | WSASend(Handle,  \*WSABuf,  uint32,  \*uint32,  uint32,  \*Overlapped,  \*uint8) error |
| syscall | Setsockopt(Handle,  int32,  int32,  \*uint8,  int32) error |
| syscall | Symlink(string,  string) error |
| syscall | Mknod(string,  uint32,  int) error |
| syscall | Mlock([]uint8) error |
| syscall | Getdents(int,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | VirtualLock(uintptr,  uintptr) error |
| syscall | Exchangedata(string,  string,  int) error |
| syscall | Ftruncate(Handle,  int64) error |
| syscall | WaitForSingleObject(Handle,  uint32) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Getpagesize() int |
| syscall | BpfBuflen(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Revoke(string) error |
| syscall | CertOpenSystemStore(Handle,  \*uint16) Handle,  errorHandle,  error(Handle,  errorHandle,  error) |
| syscall | PtraceGetEventMsg(int) uint,  erroruint,  error(uint,  erroruint,  error) |
| syscall | AcceptEx(Handle,  Handle,  \*uint8,  uint32,  uint32,  uint32,  \*uint32,  \*Overlapped) error |
| syscall | Getgroups() []int,  error[]int,  error([]int,  error[]int,  error) |
| syscall | PtracePeekData(int,  uintptr,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | GetsockoptInt(Handle,  int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Bind(Handle,  Sockaddr) error |
| syscall | CertEnumCertificatesInStore(Handle,  \*CertContext) \*CertContext,  error\*CertContext,  error(\*CertContext,  error\*CertContext,  error) |
| syscall | Syscall9(uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | Pause() error |
| syscall | Unmount(string,  int) error |
| syscall | SetBpfHeadercmpl(int,  int) error |
| syscall | Ntohs(uint16) uint16 |
| syscall | Getcwd([]uint8) int,  errorint,  error(int,  errorint,  error) |
| syscall | Sysctl(string) string,  errorstring,  error(string,  errorstring,  error) |
| syscall | ParseDirent([]uint8,  int,  []string) int,  int,  []stringint,  int,  []string(int,  int,  []stringint,  int,  []string) |
| syscall | Utime(string,  \*Utimbuf) error |
| syscall | ParseRoutingMessage([]uint8) []RoutingMessage,  error[]RoutingMessage,  error([]RoutingMessage,  error[]RoutingMessage,  error) |
| syscall | Futimesat(int,  string,  []Timeval) error |
| syscall | SetsockoptInet4Addr(int,  int,  int,  [4]uint8) error |
| syscall | CmsgSpace(int) int |
| syscall | LookupAccountSid(\*uint16,  \*SID,  \*uint16,  \*uint32,  \*uint16,  \*uint32,  \*uint32) error |
| syscall | RegEnumKeyEx(Handle,  uint32,  \*uint16,  \*uint32,  \*uint32,  \*uint16,  \*uint32,  \*Filetime) error |
| syscall | GetLengthSid(\*SID) uint32 |
| syscall | FreeLibrary(Handle) error |
| syscall | Select(int,  \*FdSet,  \*FdSet,  \*FdSet,  \*Timeval) int,  errorint,  error(int,  errorint,  error) |
| syscall | Getppid() int |
| syscall | BindToDevice(int,  string) error |
| syscall | SetNonblock(int,  bool) error |
| syscall | GetCurrentDirectory(uint32,  \*uint16) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Fallocate(int,  uint32,  int64,  int64) error |
| syscall | Munmap([]uint8) error |
| syscall | FormatMessage(uint32,  uint32,  uint32,  uint32,  []uint16,  \*uint8) uint32,  erroruint32,  error(uint32,  erroruint32,  error) |
| syscall | Getsockname(Handle) Sockaddr,  errorSockaddr,  error(Sockaddr,  errorSockaddr,  error) |
| syscall | Kevent(int,  []Kevent_t,  []Kevent_t,  \*Timespec) int,  errorint,  error(int,  errorint,  error) |
| syscall | CloseHandle(Handle) error |
| syscall | Statfs(string,  \*Statfs_t) error |
| syscall | Splice(int,  \*int64,  int,  \*int64,  int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | Fstat(int,  \*Stat_t) error |
| syscall | GetFileInformationByHandle(Handle,  \*ByHandleFileInformation) error |
| syscall | Fchmod(int,  uint32) error |
| syscall | InotifyInit1(int) int,  errorint,  error(int,  errorint,  error) |
| syscall | CryptReleaseContext(Handle,  uint32) error |
| syscall | SetsockoptTimeval(int,  int,  int,  \*Timeval) error |
| syscall | Geteuid() int |
| syscall | Accept(int) int,  Sockaddr,  errorint,  Sockaddr,  error(int,  Sockaddr,  errorint,  Sockaddr,  error) |
| syscall | SetFileTime(Handle,  \*Filetime,  \*Filetime,  \*Filetime) error |
| syscall | Setprivexec(int) error |
| syscall | SetFileAttributes(\*uint16,  uint32) error |
| syscall | Mmap(int,  int64,  int,  int,  int) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| syscall | Fstatfs(int,  \*Statfs_t) error |
| syscall | CertVerifyCertificateChainPolicy(uintptr,  \*CertChainContext,  \*CertChainPolicyPara,  \*CertChainPolicyStatus) error |
| syscall | Fsync(int) error |
| syscall | EscapeArg(string) string |
| syscall | Tee(int,  int,  int,  int) int64,  errorint64,  error(int64,  errorint64,  error) |
| syscall | Getgid() int |
| syscall | RegOpenKeyEx(Handle,  \*uint16,  uint32,  uint32,  \*Handle) error |
| syscall | RawSyscall(uintptr,  uintptr,  uintptr,  uintptr) uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno(uintptr,  uintptr,  Errnouintptr,  uintptr,  Errno) |
| syscall | Adjtimex(\*Timex) int,  errorint,  error(int,  errorint,  error) |
| syscall | SetBpfTimeout(int,  \*Timeval) error |
| syscall | Connect(Handle,  Sockaddr) error |
| syscall | FindClose(Handle) error |
| syscall | SetsockoptIPv6Mreq(int,  int,  int,  \*IPv6Mreq) error |
| syscall | SetBpfBuflen(int,  int) int,  errorint,  error(int,  errorint,  error) |
| syscall | WriteFile(Handle,  []uint8,  \*uint32,  \*Overlapped) error |
| syscall | CancelIo(Handle) error |
| syscall | Seek(Handle,  int64,  int) int64,  errorint64,  error(int64,  errorint64,  error) |
| syscall | WSACleanup() error |
| database/sql/driver | IsValue(interface{}) bool |
| database/sql/driver | IsScanValue(interface{}) bool |
| bufio | NewReader(io.Reader) \*Reader |
| bufio | NewWriter(io.Writer) \*Writer |
| bufio | NewWriterSize(io.Writer,  int) \*Writer |
| bufio | NewReaderSize(io.Reader,  int) \*Reader |
| bufio | NewReadWriter(\*Reader,  \*Writer) \*ReadWriter |
| debug/gosym | NewLineTable([]uint8,  uint64) \*LineTable |
| debug/gosym | NewTable([]uint8,  \*LineTable) \*Table,  error\*Table,  error(\*Table,  error\*Table,  error) |
| compress/bzip2 | NewReader(io.Reader) io.Reader |
| math/rand | ExpFloat64() float64 |
| math/rand | Perm(int) []int |
| math/rand | Int() int |
| math/rand | NewSource(int64) Source |
| math/rand | Int31n(int32) int32 |
| math/rand | Int31() int32 |
| math/rand | Int63() int64 |
| math/rand | Float32() float32 |
| math/rand | Float64() float64 |
| math/rand | Int63n(int64) int64 |
| math/rand | New(Source) \*Rand |
| math/rand | Uint32() uint32 |
| math/rand | Intn(int) int |
| math/rand | NewZipf(\*Rand,  float64,  float64,  uint64) \*Zipf |
| math/rand | NormFloat64() float64 |
| os/user | Current() \*User,  error\*User,  error(\*User,  error\*User,  error) |
| os/user | Lookup(string) \*User,  error\*User,  error(\*User,  error\*User,  error) |
| os/user | LookupId(string) \*User,  error\*User,  error(\*User,  error\*User,  error) |
| io/ioutil | TempDir(string,  string) string,  errorstring,  error(string,  errorstring,  error) |
| io/ioutil | ReadFile(string) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| io/ioutil | TempFile(string,  string) \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| io/ioutil | NopCloser(io.Reader) io.ReadCloser |
| io/ioutil | ReadAll(io.Reader) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| io/ioutil | WriteFile(string,  []uint8,  os.FileMode) error |
| io/ioutil | ReadDir(string) []os.FileInfo,  error[]os.FileInfo,  error([]os.FileInfo,  error[]os.FileInfo,  error) |
| os/exec | LookPath(string) string,  errorstring,  error(string,  errorstring,  error) |
| os/exec | Command(string,  ...string) \*Cmd |
| runtime/metrics | All() []Description |
| net/rpc/jsonrpc | NewServerCodec(io.ReadWriteCloser) rpc.ServerCodec |
| net/rpc/jsonrpc | NewClient(io.ReadWriteCloser) \*rpc.Client |
| net/rpc/jsonrpc | NewClientCodec(io.ReadWriteCloser) rpc.ClientCodec |
| net/rpc/jsonrpc | Dial(string,  string) \*rpc.Client,  error\*rpc.Client,  error(\*rpc.Client,  error\*rpc.Client,  error) |
| compress/flate | NewReaderDict(io.Reader,  []uint8) io.ReadCloser |
| compress/flate | NewWriterDict(io.Writer,  int,  []uint8) \*Writer,  error\*Writer,  error(\*Writer,  error\*Writer,  error) |
| compress/flate | NewReader(io.Reader) io.ReadCloser |
| compress/flate | NewWriter(io.Writer,  int) \*Writer,  error\*Writer,  error(\*Writer,  error\*Writer,  error) |
| compress/gzip | NewWriter(io.Writer) \*Writer |
| compress/gzip | NewReader(io.Reader) \*Reader,  error\*Reader,  error(\*Reader,  error\*Reader,  error) |
| compress/gzip | NewWriterLevel(io.Writer,  int) \*Writer,  error\*Writer,  error(\*Writer,  error\*Writer,  error) |
| net/http/pprof | Handler(string) http.Handler |
| testing/iotest | TruncateWriter(io.Writer,  int64) io.Writer |
| testing/iotest | DataErrReader(io.Reader) io.Reader |
| testing/iotest | NewReadLogger(string,  io.Reader) io.Reader |
| testing/iotest | NewWriteLogger(string,  io.Writer) io.Writer |
| testing/iotest | OneByteReader(io.Reader) io.Reader |
| testing/iotest | HalfReader(io.Reader) io.Reader |
| testing/iotest | TimeoutReader(io.Reader) io.Reader |
| net/http/httptest | NewRecorder() \*ResponseRecorder |
| net/http/httptest | NewUnstartedServer(http.Handler) \*Server |
| net/http/httptest | NewTLSServer(http.Handler) \*Server |
| net/http/httptest | NewServer(http.Handler) \*Server |
| net/http/cgi | Request() \*http.Request,  error\*http.Request,  error(\*http.Request,  error\*http.Request,  error) |
| net/http/cgi | RequestFromMap(map[string]string) \*http.Request,  error\*http.Request,  error(\*http.Request,  error\*http.Request,  error) |
| net/http/cgi | Serve(http.Handler) error |
| net/http/fcgi | Serve(net.Listener,  http.Handler) error |
| net | LookupMX(string) []\*MX,  error[]\*MX,  error([]\*MX,  error[]\*MX,  error) |
| net | ResolveUnixAddr(string,  string) \*UnixAddr,  error\*UnixAddr,  error(\*UnixAddr,  error\*UnixAddr,  error) |
| net | FileListener(\*os.File) Listener,  errorListener,  error(Listener,  errorListener,  error) |
| net | IPv4(uint8,  uint8,  uint8,  uint8) IP |
| net | InterfaceAddrs() []Addr,  error[]Addr,  error([]Addr,  error[]Addr,  error) |
| net | Pipe() Conn,  ConnConn,  Conn(Conn,  ConnConn,  Conn) |
| net | LookupCNAME(string) string,  errorstring,  error(string,  errorstring,  error) |
| net | LookupIP(string) []IP,  error[]IP,  error([]IP,  error[]IP,  error) |
| net | LookupPort(string,  string) int,  errorint,  error(int,  errorint,  error) |
| net | ListenUnixgram(string,  \*UnixAddr) \*UDPConn,  error\*UDPConn,  error(\*UDPConn,  error\*UDPConn,  error) |
| net | InterfaceByIndex(int) \*Interface,  error\*Interface,  error(\*Interface,  error\*Interface,  error) |
| net | ListenTCP(string,  \*TCPAddr) \*TCPListener,  error\*TCPListener,  error(\*TCPListener,  error\*TCPListener,  error) |
| net | ListenIP(string,  \*IPAddr) \*IPConn,  error\*IPConn,  error(\*IPConn,  error\*IPConn,  error) |
| net | ResolveUDPAddr(string,  string) \*UDPAddr,  error\*UDPAddr,  error(\*UDPAddr,  error\*UDPAddr,  error) |
| net | DialTimeout(string,  string,  time.Duration) Conn,  errorConn,  error(Conn,  errorConn,  error) |
| net | FilePacketConn(\*os.File) PacketConn,  errorPacketConn,  error(PacketConn,  errorPacketConn,  error) |
| net | ListenUDP(string,  \*UDPAddr) \*UDPConn,  error\*UDPConn,  error(\*UDPConn,  error\*UDPConn,  error) |
| net | ResolveIPAddr(string,  string) \*IPAddr,  error\*IPAddr,  error(\*IPAddr,  error\*IPAddr,  error) |
| net | CIDRMask(int,  int) IPMask |
| net | LookupHost(string) []string,  error[]string,  error([]string,  error[]string,  error) |
| net | JoinHostPort(string,  string) string |
| net | ResolveTCPAddr(string,  string) \*TCPAddr,  error\*TCPAddr,  error(\*TCPAddr,  error\*TCPAddr,  error) |
| net | Dial(string,  string) Conn,  errorConn,  error(Conn,  errorConn,  error) |
| net | FileConn(\*os.File) Conn,  errorConn,  error(Conn,  errorConn,  error) |
| net | SplitHostPort(string) string,  string,  errorstring,  string,  error(string,  string,  errorstring,  string,  error) |
| net | DialUnix(string,  \*UnixAddr,  \*UnixAddr) \*UnixConn,  error\*UnixConn,  error(\*UnixConn,  error\*UnixConn,  error) |
| net | LookupAddr(string) []string,  error[]string,  error([]string,  error[]string,  error) |
| net | InterfaceByName(string) \*Interface,  error\*Interface,  error(\*Interface,  error\*Interface,  error) |
| net | LookupTXT(string) []string,  error[]string,  error([]string,  error[]string,  error) |
| net | ListenUnix(string,  \*UnixAddr) \*UnixListener,  error\*UnixListener,  error(\*UnixListener,  error\*UnixListener,  error) |
| net | DialUDP(string,  \*UDPAddr,  \*UDPAddr) \*UDPConn,  error\*UDPConn,  error(\*UDPConn,  error\*UDPConn,  error) |
| net | Interfaces() []Interface,  error[]Interface,  error([]Interface,  error[]Interface,  error) |
| net | ParseIP(string) IP |
| net | IPv4Mask(uint8,  uint8,  uint8,  uint8) IPMask |
| net | Listen(string,  string) Listener,  errorListener,  error(Listener,  errorListener,  error) |
| net | DialTCP(string,  \*TCPAddr,  \*TCPAddr) \*TCPConn,  error\*TCPConn,  error(\*TCPConn,  error\*TCPConn,  error) |
| net | DialIP(string,  \*IPAddr,  \*IPAddr) \*IPConn,  error\*IPConn,  error(\*IPConn,  error\*IPConn,  error) |
| net | ParseMAC(string) HardwareAddr,  errorHardwareAddr,  error(HardwareAddr,  errorHardwareAddr,  error) |
| net | LookupSRV(string,  string,  string) string,  []\*SRV,  errorstring,  []\*SRV,  error(string,  []\*SRV,  errorstring,  []\*SRV,  error) |
| net | ListenPacket(string,  string) PacketConn,  errorPacketConn,  error(PacketConn,  errorPacketConn,  error) |
| net | ListenMulticastUDP(string,  \*Interface,  \*UDPAddr) \*UDPConn,  error\*UDPConn,  error(\*UDPConn,  error\*UDPConn,  error) |
| net | ParseCIDR(string) IP,  \*IPNet,  errorIP,  \*IPNet,  error(IP,  \*IPNet,  errorIP,  \*IPNet,  error) |
| runtime/debug | Stack() []uint8 |
| net/smtp | CRAMMD5Auth(string,  string) Auth |
| net/smtp | PlainAuth(string,  string,  string,  string) Auth |
| net/smtp | NewClient(net.Conn,  string) \*Client,  error\*Client,  error(\*Client,  error\*Client,  error) |
| net/smtp | Dial(string) \*Client,  error\*Client,  error(\*Client,  error\*Client,  error) |
| net/smtp | SendMail(string,  Auth,  string,  []string,  []uint8) error |
| os | Lstat(string) FileInfo,  errorFileInfo,  error(FileInfo,  errorFileInfo,  error) |
| os | SameFile(FileInfo,  FileInfo) bool |
| os | Hostname() string,  errorstring,  error(string,  errorstring,  error) |
| os | Chtimes(string,  time.Time,  time.Time) error |
| os | StartProcess(string,  []string,  \*ProcAttr) \*Process,  error\*Process,  error(\*Process,  error\*Process,  error) |
| os | Geteuid() int |
| os | NewSyscallError(string,  error) error |
| os | Readlink(string) string,  errorstring,  error(string,  errorstring,  error) |
| os | Mkdir(string,  FileMode) error |
| os | IsPathSeparator(uint8) bool |
| os | Link(string,  string) error |
| os | Getuid() int |
| os | Open(string) \*File,  error\*File,  error(\*File,  error\*File,  error) |
| os | Getwd() string,  errorstring,  error(string,  errorstring,  error) |
| os | Getpid() int |
| os | Setenv(string,  string) error |
| os | Pipe() \*File,  \*File,  error\*File,  \*File,  error(\*File,  \*File,  error\*File,  \*File,  error) |
| os | Remove(string) error |
| os | Getppid() int |
| os | ExpandEnv(string) string |
| os | IsNotExist(error) bool |
| os | Getgid() int |
| os | Getgroups() []int,  error[]int,  error([]int,  error[]int,  error) |
| os | RemoveAll(string) error |
| os | Chmod(string,  FileMode) error |
| os | Lchown(string,  int,  int) error |
| os | Symlink(string,  string) error |
| os | IsExist(error) bool |
| os | Truncate(string,  int64) error |
| os | IsPermission(error) bool |
| os | FindProcess(int) \*Process,  error\*Process,  error(\*Process,  error\*Process,  error) |
| os | Chdir(string) error |
| os | Chown(string,  int,  int) error |
| os | NewFile(uintptr,  string) \*File |
| os | OpenFile(string,  int,  FileMode) \*File,  error\*File,  error(\*File,  error\*File,  error) |
| os | Rename(string,  string) error |
| os | Create(string) \*File,  error\*File,  error(\*File,  error\*File,  error) |
| os | Environ() []string |
| os | MkdirAll(string,  FileMode) error |
| os | Stat(string) FileInfo,  errorFileInfo,  error(FileInfo,  errorFileInfo,  error) |
| os | Getenv(string) string |
| os | Getegid() int |
| os | Getpagesize() int |
| os | TempDir() string |
| image | RegisterFormat(string,  string,  func(io.Reader) Image,  error,  funcio.Reader Config,  errorImage,  error,  funcio.Reader Config,  error(Image,  error,  funcio.Reader Config,  errorImage,  error,  funcio.Reader Config,  error) |
| archive/tar | NewReader(io.Reader) \*Reader |
| archive/tar | NewWriter(io.Writer) \*Writer |
| compress/zlib | NewReaderDict(io.Reader,  []uint8) io.ReadCloser,  errorio.ReadCloser,  error(io.ReadCloser,  errorio.ReadCloser,  error) |
| compress/zlib | NewWriter(io.Writer) \*Writer |
| compress/zlib | NewWriterLevelDict(io.Writer,  int,  []uint8) \*Writer,  error\*Writer,  error(\*Writer,  error\*Writer,  error) |
| compress/zlib | NewReader(io.Reader) io.ReadCloser,  errorio.ReadCloser,  error(io.ReadCloser,  errorio.ReadCloser,  error) |
| compress/zlib | NewWriterLevel(io.Writer,  int) \*Writer,  error\*Writer,  error(\*Writer,  error\*Writer,  error) |
| net/http/httputil | NewSingleHostReverseProxy(\*url.URL) \*ReverseProxy |
| net/http/httputil | DumpResponse(\*http.Response,  bool) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/http/httputil | DumpRequest(\*http.Request,  bool) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/http/httputil | NewServerConn(net.Conn,  \*bufio.Reader) \*ServerConn |
| net/http/httputil | NewChunkedReader(io.Reader) io.Reader |
| net/http/httputil | NewProxyClientConn(net.Conn,  \*bufio.Reader) \*ClientConn |
| net/http/httputil | NewClientConn(net.Conn,  \*bufio.Reader) \*ClientConn |
| net/http/httputil | DumpRequestOut(\*http.Request,  bool) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/http/httputil | NewChunkedWriter(io.Writer) io.WriteCloser |
| io | WriteString(Writer,  string) int,  errorint,  error(int,  errorint,  error) |
| io | ReadAtLeast(Reader,  []uint8,  int) int,  errorint,  error(int,  errorint,  error) |
| io | LimitReader(Reader,  int64) Reader |
| io | TeeReader(Reader,  Writer) Reader |
| io | ReadFull(Reader,  []uint8) int,  errorint,  error(int,  errorint,  error) |
| io | Pipe() \*PipeReader,  \*PipeWriter\*PipeReader,  \*PipeWriter(\*PipeReader,  \*PipeWriter\*PipeReader,  \*PipeWriter) |
| io | NewSectionReader(ReaderAt,  int64,  int64) \*SectionReader |
| io | MultiReader(...Reader) Reader |
| io | CopyN(Writer,  Reader,  int64) int64,  errorint64,  error(int64,  errorint64,  error) |
| io | MultiWriter(...Writer) Writer |
| io | Copy(Writer,  Reader) int64,  errorint64,  error(int64,  errorint64,  error) |
| runtime/trace | Start(io.Writer) error |
| archive/zip | NewReader(io.ReaderAt,  int64) \*Reader,  error\*Reader,  error(\*Reader,  error\*Reader,  error) |
| archive/zip | OpenReader(string) \*ReadCloser,  error\*ReadCloser,  error(\*ReadCloser,  error\*ReadCloser,  error) |
| archive/zip | NewWriter(io.Writer) \*Writer |
| archive/zip | FileInfoHeader(os.FileInfo) \*FileHeader,  error\*FileHeader,  error(\*FileHeader,  error\*FileHeader,  error) |
| runtime | Version() string |
| runtime | GOMAXPROCS(int) int |
| runtime | FuncForPC(uintptr) \*Func |
| runtime | NumGoroutine() int |
| runtime | Callers(int,  []uintptr) int |
| runtime | Caller(int) uintptr,  string,  int,  booluintptr,  string,  int,  bool(uintptr,  string,  int,  booluintptr,  string,  int,  bool) |
| runtime | MemProfile([]MemProfileRecord,  bool) int,  boolint,  bool(int,  boolint,  bool) |
| runtime | NumCgoCall() int64 |
| runtime | CPUProfile() []uint8 |
| runtime | ThreadCreateProfile([]StackRecord) int,  boolint,  bool(int,  boolint,  bool) |
| runtime | GoroutineProfile([]StackRecord) int,  boolint,  bool(int,  boolint,  bool) |
| runtime | GOROOT() string |
| runtime | Stack([]uint8,  bool) int |
| runtime | NumCPU() int |
| net/http | Serve(net.Listener,  Handler) error |
| net/http | StripPrefix(string,  Handler) Handler |
| net/http | Head(string) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | TimeoutHandler(Handler,  time.Duration,  string) Handler |
| net/http | ReadResponse(\*bufio.Reader,  \*Request) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | ReadRequest(\*bufio.Reader) \*Request,  error\*Request,  error(\*Request,  error\*Request,  error) |
| net/http | ProxyFromEnvironment(\*Request) \*url.URL,  error\*url.URL,  error(\*url.URL,  error\*url.URL,  error) |
| net/http | StatusText(int) string |
| net/http | FileServer(FileSystem) Handler |
| net/http | Post(string,  string,  io.Reader) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | MaxBytesReader(ResponseWriter,  io.ReadCloser,  int64) io.ReadCloser |
| net/http | CanonicalHeaderKey(string) string |
| net/http | Get(string) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | NewRequest(string,  string,  io.Reader) \*Request,  error\*Request,  error(\*Request,  error\*Request,  error) |
| net/http | NewServeMux() \*ServeMux |
| net/http | ParseHTTPVersion(string) int,  int,  boolint,  int,  bool(int,  int,  boolint,  int,  bool) |
| net/http | RedirectHandler(string,  int) Handler |
| net/http | PostForm(string,  url.Values) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | NotFoundHandler() Handler |
| net/http | NewFileTransport(FileSystem) RoundTripper |
| net/http | ListenAndServe(string,  Handler) error |
| net/http | ProxyURL(\*url.URL) func\*Request \*url.URL,  errorfunc\*Request \*url.URL,  error(func\*Request \*url.URL,  errorfunc\*Request \*url.URL,  error) |
| net/http | DetectContentType([]uint8) string |
| net/http | ListenAndServeTLS(string,  string,  string,  Handler) error |
| compress/lzw | NewReader(io.Reader,  Order,  int) io.ReadCloser |
| compress/lzw | NewWriter(io.Writer,  Order,  int) io.WriteCloser |
| runtime/pprof | ForLabels(context.Context,  func(string,  string) bool) |
| io/fs | FileInfoToDirEntry(FileInfo) DirEntry |
| database/sql | Open(string,  string) \*DB,  error\*DB,  error(\*DB,  error\*DB,  error) |
| go/types | NewConst(token.Pos,  \*Package,  string,  Type,  constant.Value) \*Const |
| net/http/cookiejar | New(\*Options) \*Jar,  error\*Jar,  error(\*Jar,  error\*Jar,  error) |
| net/rpc | DialHTTP(string,  string) \*Client,  error\*Client,  error(\*Client,  error\*Client,  error) |
| net/rpc | RegisterName(string,  interface{}) error |
| net/rpc | NewClientWithCodec(ClientCodec) \*Client |
| net/rpc | Dial(string,  string) \*Client,  error\*Client,  error(\*Client,  error\*Client,  error) |
| net/rpc | ServeRequest(ServerCodec) error |
| net/rpc | NewClient(io.ReadWriteCloser) \*Client |
| net/rpc | Register(interface{}) error |
| net/rpc | DialHTTPPath(string,  string,  string) \*Client,  error\*Client,  error(\*Client,  error\*Client,  error) |
| net/rpc | NewServer() \*Server |
| runtime/cgo | NewHandle(interface{}) Handle |
| crypto/rand | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| crypto/rand | Int(io.Reader,  \*big.Int) \*big.Int,  error\*big.Int,  error(\*big.Int,  error\*big.Int,  error) |
| crypto/rand | Prime(io.Reader,  int) \*big.Int,  error\*big.Int,  error(\*big.Int,  error\*big.Int,  error) |
| net/mail | ReadMessage(io.Reader) \*Message,  error\*Message,  error(\*Message,  error\*Message,  error) |
| time | Now() Time |
| time | Since(Time) Duration |
| time | Until(Time) Duration |
| net/url | ParseRequestURI(string) \*URL,  error\*URL,  error(\*URL,  error\*URL,  error) |
| net/url | QueryUnescape(string) string,  errorstring,  error(string,  errorstring,  error) |
| net/url | QueryEscape(string) string |
| net/url | ParseQuery(string) Values,  errorValues,  error(Values,  errorValues,  error) |
| net/url | UserPassword(string,  string) \*Userinfo |
| net/url | Parse(string) \*URL,  error\*URL,  error(\*URL,  error\*URL,  error) |
| net/url | User(string) \*Userinfo |
| runtime/pprof | Profiles() []\*Profile |
| runtime/pprof | NewProfile(string) \*Profile |
| runtime/pprof | StartCPUProfile(io.Writer) error |
| runtime/pprof | Lookup(string) \*Profile |
| runtime/pprof | WriteHeapProfile(io.Writer) error |
| os | Expand(string,  func(string) string) string |
| net/textproto | CanonicalMIMEHeaderKey(string) string |
| net/textproto | NewConn(io.ReadWriteCloser) \*Conn |
| net/textproto | Dial(string,  string) \*Conn,  error\*Conn,  error(\*Conn,  error\*Conn,  error) |
| net/textproto | NewWriter(\*bufio.Writer) \*Writer |
| net/textproto | NewReader(\*bufio.Reader) \*Reader |

| Package | Receiver | Method Signature |
|---|---|---|
| syscall | WaitStatus | Signaled() bool |
| syscall | \*DLL | Release() error |
| syscall | WaitStatus | Exited() bool |
| syscall | \*DLLError | Error() string |
| syscall | \*LazyDLL | Handle() uintptr |
| syscall | Token | Close() error |
| syscall | WaitStatus | Stopped() bool |
| syscall | Token | GetTokenPrimaryGroup() \*Tokenprimarygroup,  error\*Tokenprimarygroup,  error(\*Tokenprimarygroup,  error\*Tokenprimarygroup,  error) |
| syscall | WaitStatus | ExitStatus() int |
| syscall | Token | GetTokenUser() \*Tokenuser,  error\*Tokenuser,  error(\*Tokenuser,  error\*Tokenuser,  error) |
| syscall | \*Timespec | Unix() int64,  int64int64,  int64(int64,  int64int64,  int64) |
| syscall | \*Proc | Call(...uintptr) uintptr,  uintptr,  erroruintptr,  uintptr,  error(uintptr,  uintptr,  erroruintptr,  uintptr,  error) |
| syscall | Signal | String() string |
| syscall | Errno | Temporary() bool |
| syscall | Errno | Error() string |
| syscall | \*Filetime | Nanoseconds() int64 |
| syscall | \*Proc | Addr() uintptr |
| syscall | \*SID | LookupAccount(string) string,  string,  uint32,  errorstring,  string,  uint32,  error(string,  string,  uint32,  errorstring,  string,  uint32,  error) |
| syscall | \*Timeval | Nanoseconds() int64 |
| syscall | \*RawSockaddrAny | Sockaddr() Sockaddr,  errorSockaddr,  error(Sockaddr,  errorSockaddr,  error) |
| syscall | \*LazyDLL | Load() error |
| syscall | Token | GetUserProfileDirectory() string,  errorstring,  error(string,  errorstring,  error) |
| syscall | WaitStatus | TrapCause() int |
| syscall | \*SID | String() string,  errorstring,  error(string,  errorstring,  error) |
| syscall | \*PtraceRegs | PC() uint64 |
| syscall | WaitStatus | CoreDump() bool |
| syscall | Errno | Timeout() bool |
| syscall | \*Timeval | Unix() int64,  int64int64,  int64(int64,  int64int64,  int64) |
| syscall | \*Timeval | Nano() int64 |
| syscall | WaitStatus | Signal() Signal |
| syscall | \*LazyProc | Addr() uintptr |
| syscall | WaitStatus | Continued() bool |
| syscall | \*DLL | MustFindProc(string) \*Proc |
| syscall | \*SID | Len() int |
| syscall | \*DLL | FindProc(string) \*Proc,  error\*Proc,  error(\*Proc,  error\*Proc,  error) |
| syscall | \*LazyProc | Call(...uintptr) uintptr,  uintptr,  erroruintptr,  uintptr,  error(uintptr,  uintptr,  erroruintptr,  uintptr,  error) |
| syscall | \*LazyProc | Find() error |
| syscall | WaitStatus | StopSignal() Signal |
| syscall | \*SID | Copy() \*SID,  error\*SID,  error(\*SID,  error\*SID,  error) |
| syscall | \*Timespec | Nano() int64 |
| syscall | \*LazyDLL | NewProc(string) \*LazyProc |
| database/sql/driver | RowsAffected | RowsAffected() int64,  errorint64,  error(int64,  errorint64,  error) |
| database/sql/driver | NotNull | ConvertValue(interface{}) Value,  errorValue,  error(Value,  errorValue,  error) |
| database/sql/driver | RowsAffected | LastInsertId() int64,  errorint64,  error(int64,  errorint64,  error) |
| database/sql/driver | Null | ConvertValue(interface{}) Value,  errorValue,  error(Value,  errorValue,  error) |
| bufio | ReadWriter | WriteByte(uint8) error |
| bufio | \*Reader | UnreadRune() error |
| bufio | ReadWriter | WriteRune(int32) int,  errorint,  error(int,  errorint,  error) |
| bufio | ReadWriter | ReadBytes(uint8) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| bufio | ReadWriter | ReadLine() []uint8,  bool,  error[]uint8,  bool,  error([]uint8,  bool,  error[]uint8,  bool,  error) |
| bufio | ReadWriter | Available() int |
| bufio | \*Writer | WriteByte(uint8) error |
| bufio | \*Reader | ReadString(uint8) string,  errorstring,  error(string,  errorstring,  error) |
| bufio | \*Writer | WriteRune(int32) int,  errorint,  error(int,  errorint,  error) |
| bufio | \*Writer | Available() int |
| bufio | \*Reader | ReadLine() []uint8,  bool,  error[]uint8,  bool,  error([]uint8,  bool,  error[]uint8,  bool,  error) |
| bufio | \*Reader | ReadByte() uint8,  erroruint8,  error(uint8,  erroruint8,  error) |
| bufio | \*Writer | Buffered() int |
| bufio | \*Reader | UnreadByte() error |
| bufio | \*Reader | ReadSlice(uint8) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| bufio | ReadWriter | WriteString(string) int,  errorint,  error(int,  errorint,  error) |
| bufio | ReadWriter | Peek(int) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| bufio | ReadWriter | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| bufio | ReadWriter | ReadString(uint8) string,  errorstring,  error(string,  errorstring,  error) |
| bufio | ReadWriter | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| bufio | \*Reader | ReadRune() int32,  int,  errorint32,  int,  error(int32,  int,  errorint32,  int,  error) |
| bufio | \*Reader | Buffered() int |
| bufio | ReadWriter | ReadByte() uint8,  erroruint8,  error(uint8,  erroruint8,  error) |
| bufio | ReadWriter | UnreadByte() error |
| bufio | \*Writer | WriteString(string) int,  errorint,  error(int,  errorint,  error) |
| bufio | \*Writer | Flush() error |
| bufio | \*Reader | Peek(int) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| bufio | ReadWriter | Flush() error |
| bufio | ReadWriter | ReadSlice(uint8) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| bufio | \*Reader | ReadBytes(uint8) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| bufio | \*Reader | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| bufio | ReadWriter | ReadRune() int32,  int,  errorint32,  int,  error(int32,  int,  errorint32,  int,  error) |
| bufio | ReadWriter | UnreadRune() error |
| bufio | \*Writer | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| debug/gosym | UnknownFileError | Error() string |
| debug/gosym | \*Sym | PackageName() string |
| debug/gosym | \*Sym | BaseName() string |
| debug/gosym | \*Table | SymByAddr(uint64) \*Sym |
| debug/gosym | \*UnknownLineError | Error() string |
| debug/gosym | \*Table | PCToFunc(uint64) \*Func |
| debug/gosym | \*Table | LookupSym(string) \*Sym |
| debug/gosym | \*Table | PCToLine(uint64) string,  int,  \*Funcstring,  int,  \*Func(string,  int,  \*Funcstring,  int,  \*Func) |
| debug/gosym | \*LineTable | LineToPC(int,  uint64) uint64 |
| debug/gosym | \*LineTable | PCToLine(uint64) int |
| debug/gosym | \*Sym | Static() bool |
| debug/gosym | \*Table | LookupFunc(string) \*Func |
| debug/gosym | Func | ReceiverName() string |
| debug/gosym | \*Sym | ReceiverName() string |
| debug/gosym | \*Table | LineToPC(string,  int) uint64,  \*Func,  erroruint64,  \*Func,  error(uint64,  \*Func,  erroruint64,  \*Func,  error) |
| debug/gosym | Func | PackageName() string |
| debug/gosym | Func | BaseName() string |
| debug/gosym | Func | Static() bool |
| debug/gosym | \*DecodingError | Error() string |
| compress/bzip2 | StructuralError | Error() string |
| math/rand | \*Rand | Float64() float64 |
| math/rand | \*Rand | Int31n(int32) int32 |
| math/rand | \*Rand | Perm(int) []int |
| math/rand | \*Rand | Int63n(int64) int64 |
| math/rand | \*Rand | Int31() int32 |
| math/rand | \*Rand | Int() int |
| math/rand | \*Rand | Float32() float32 |
| math/rand | \*Zipf | Uint64() uint64 |
| math/rand | \*Rand | Uint32() uint32 |
| math/rand | \*Rand | Intn(int) int |
| math/rand | \*Rand | ExpFloat64() float64 |
| math/rand | \*Rand | NormFloat64() float64 |
| math/rand | \*Rand | Int63() int64 |
| os/user | UnknownUserIdError | Error() string |
| os/user | UnknownUserError | Error() string |
| os/exec | ExitError | String() string |
| os/exec | \*Cmd | Wait() error |
| os/exec | \*Cmd | StdoutPipe() io.ReadCloser,  errorio.ReadCloser,  error(io.ReadCloser,  errorio.ReadCloser,  error) |
| os/exec | ExitError | Exited() bool |
| os/exec | ExitError | Sys() interface{} |
| os/exec | ExitError | Success() bool |
| os/exec | ExitError | Pid() int |
| os/exec | \*ExitError | Error() string |
| os/exec | ExitError | SysUsage() interface{} |
| os/exec | \*Cmd | Start() error |
| os/exec | \*Cmd | CombinedOutput() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| os/exec | \*Cmd | Output() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| os/exec | \*Error | Error() string |
| os/exec | \*Cmd | StderrPipe() io.ReadCloser,  errorio.ReadCloser,  error(io.ReadCloser,  errorio.ReadCloser,  error) |
| os/exec | ExitError | SystemTime() time.Duration |
| os/exec | ExitError | UserTime() time.Duration |
| os/exec | \*Cmd | StdinPipe() io.WriteCloser,  errorio.WriteCloser,  error(io.WriteCloser,  errorio.WriteCloser,  error) |
| os/exec | \*Cmd | Run() error |
| runtime/metrics | Value | Kind() ValueKind |
| runtime/metrics | Value | Float64() float64 |
| runtime/metrics | Value | Uint64() uint64 |
| runtime/metrics | Value | Float64Histogram() \*Float64Histogram |
| compress/flate | \*Writer | Flush() error |
| compress/flate | CorruptInputError | Error() string |
| compress/flate | \*Writer | Close() error |
| compress/flate | \*ReadError | Error() string |
| compress/flate | \*WriteError | Error() string |
| compress/flate | \*Writer | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| compress/flate | InternalError | Error() string |
| compress/gzip | \*Reader | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| compress/gzip | \*Writer | Close() error |
| compress/gzip | \*Reader | Close() error |
| compress/gzip | \*Writer | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net/http/httptest | \*ResponseRecorder | Header() http.Header |
| net/http/httptest | \*ResponseRecorder | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| embed | FS | ReadFile(string) []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| embed | FS | ReadDir(string) []fs.DirEntry,  error[]fs.DirEntry,  error([]fs.DirEntry,  error[]fs.DirEntry,  error) |
| embed | FS | Open(string) fs.File,  errorfs.File,  error(fs.File,  errorfs.File,  error) |
| net | \*UDPConn | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*DNSConfigError | Timeout() bool |
| net | \*UDPConn | SetReadBuffer(int) error |
| net | \*TCPConn | ReadFrom(io.Reader) int64,  errorint64,  error(int64,  errorint64,  error) |
| net | IP | IsGlobalUnicast() bool |
| net | UnknownNetworkError | Timeout() bool |
| net | \*TCPConn | LocalAddr() Addr |
| net | \*UnixListener | File() \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| net | \*TCPListener | AcceptTCP() \*TCPConn,  error\*TCPConn,  error(\*TCPConn,  error\*TCPConn,  error) |
| net | \*TCPListener | File() \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| net | \*UDPAddr | String() string |
| net | \*UnixAddr | Network() string |
| net | IP | To16() IP |
| net | UnknownNetworkError | Temporary() bool |
| net | \*IPConn | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*UnixConn | SetReadDeadline(time.Time) error |
| net | \*UnixConn | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*TCPConn | SetWriteBuffer(int) error |
| net | IP | IsLinkLocalMulticast() bool |
| net | \*IPConn | RemoteAddr() Addr |
| net | Flags | String() string |
| net | \*IPConn | SetReadDeadline(time.Time) error |
| net | \*UDPConn | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*DNSConfigError | Temporary() bool |
| net | IP | IsLinkLocalUnicast() bool |
| net | IP | IsLoopback() bool |
| net | IPMask | Size() int,  intint,  int(int,  intint,  int) |
| net | \*IPAddr | Network() string |
| net | IP | Mask(IPMask) IP |
| net | \*IPNet | Contains(IP) bool |
| net | \*OpError | Error() string |
| net | \*UnixAddr | String() string |
| net | \*DNSError | Error() string |
| net | \*TCPConn | CloseWrite() error |
| net | \*ParseError | Error() string |
| net | \*UnixConn | SetWriteDeadline(time.Time) error |
| net | \*UDPConn | RemoteAddr() Addr |
| net | \*IPNet | String() string |
| net | \*UnixListener | Addr() Addr |
| net | \*UDPConn | WriteTo([]uint8,  Addr) int,  errorint,  error(int,  errorint,  error) |
| net | \*IPConn | SetReadBuffer(int) error |
| net | \*UnixConn | File() \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| net | \*UnixListener | AcceptUnix() \*UnixConn,  error\*UnixConn,  error(\*UnixConn,  error\*UnixConn,  error) |
| net | IPMask | String() string |
| net | \*TCPListener | Close() error |
| net | IP | IsUnspecified() bool |
| net | \*UDPConn | SetDeadline(time.Time) error |
| net | \*OpError | Temporary() bool |
| net | \*DNSError | Temporary() bool |
| net | \*UnixListener | Close() error |
| net | \*OpError | Timeout() bool |
| net | \*UnixConn | RemoteAddr() Addr |
| net | \*UnixConn | WriteMsgUnix([]uint8,  []uint8,  \*UnixAddr) int,  int,  errorint,  int,  error(int,  int,  errorint,  int,  error) |
| net | IP | DefaultMask() IPMask |
| net | InvalidAddrError | Temporary() bool |
| net | InvalidAddrError | Error() string |
| net | \*TCPConn | SetReadBuffer(int) error |
| net | \*TCPConn | CloseRead() error |
| net | \*IPConn | WriteTo([]uint8,  Addr) int,  errorint,  error(int,  errorint,  error) |
| net | UnknownNetworkError | Error() string |
| net | \*UnixConn | ReadFromUnix([]uint8) int,  \*UnixAddr,  errorint,  \*UnixAddr,  error(int,  \*UnixAddr,  errorint,  \*UnixAddr,  error) |
| net | \*TCPConn | SetWriteDeadline(time.Time) error |
| net | \*TCPConn | SetDeadline(time.Time) error |
| net | \*IPConn | SetWriteDeadline(time.Time) error |
| net | \*TCPConn | SetLinger(int) error |
| net | \*UnixConn | SetDeadline(time.Time) error |
| net | \*IPConn | LocalAddr() Addr |
| net | \*TCPConn | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*TCPAddr | Network() string |
| net | \*IPConn | SetDeadline(time.Time) error |
| net | \*UnixConn | LocalAddr() Addr |
| net | \*Interface | MulticastAddrs() []Addr,  error[]Addr,  error([]Addr,  error[]Addr,  error) |
| net | \*Interface | Addrs() []Addr,  error[]Addr,  error([]Addr,  error[]Addr,  error) |
| net | \*UDPConn | WriteToUDP([]uint8,  \*UDPAddr) int,  errorint,  error(int,  errorint,  error) |
| net | InvalidAddrError | Timeout() bool |
| net | \*UnixConn | WriteTo([]uint8,  Addr) int,  errorint,  error(int,  errorint,  error) |
| net | \*TCPConn | RemoteAddr() Addr |
| net | IP | Equal(IP) bool |
| net | \*UDPConn | SetWriteDeadline(time.Time) error |
| net | \*IPConn | SetWriteBuffer(int) error |
| net | \*DNSError | Timeout() bool |
| net | \*UnixConn | SetWriteBuffer(int) error |
| net | \*IPNet | Network() string |
| net | IP | IsInterfaceLocalMulticast() bool |
| net | \*UDPConn | ReadFromUDP([]uint8) int,  \*UDPAddr,  errorint,  \*UDPAddr,  error(int,  \*UDPAddr,  errorint,  \*UDPAddr,  error) |
| net | \*TCPConn | SetReadDeadline(time.Time) error |
| net | \*UDPConn | SetWriteBuffer(int) error |
| net | IP | IsMulticast() bool |
| net | \*DNSConfigError | Error() string |
| net | \*UnixListener | SetDeadline(time.Time) error |
| net | \*IPConn | ReadFromIP([]uint8) int,  \*IPAddr,  errorint,  \*IPAddr,  error(int,  \*IPAddr,  errorint,  \*IPAddr,  error) |
| net | \*UnixListener | Accept() Conn,  errorConn,  error(Conn,  errorConn,  error) |
| net | \*AddrError | Error() string |
| net | \*UnixConn | ReadFrom([]uint8) int,  Addr,  errorint,  Addr,  error(int,  Addr,  errorint,  Addr,  error) |
| net | \*TCPConn | SetKeepAlive(bool) error |
| net | \*UnixConn | ReadMsgUnix([]uint8,  []uint8) int,  int,  int,  \*UnixAddr,  errorint,  int,  int,  \*UnixAddr,  error(int,  int,  int,  \*UnixAddr,  errorint,  int,  int,  \*UnixAddr,  error) |
| net | \*UnixConn | WriteToUnix([]uint8,  \*UnixAddr) int,  errorint,  error(int,  errorint,  error) |
| net | \*UnixConn | Close() error |
| net | HardwareAddr | String() string |
| net | \*UnixConn | SetReadBuffer(int) error |
| net | \*UDPConn | SetReadDeadline(time.Time) error |
| net | \*UDPConn | Close() error |
| net | \*TCPListener | SetDeadline(time.Time) error |
| net | \*AddrError | Timeout() bool |
| net | \*IPConn | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*UDPConn | LocalAddr() Addr |
| net | \*TCPConn | File() \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| net | \*IPConn | File() \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| net | \*UnixConn | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | IP | To4() IP |
| net | \*UDPAddr | Network() string |
| net | \*TCPAddr | String() string |
| net | \*TCPConn | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net | \*AddrError | Temporary() bool |
| net | \*TCPConn | SetNoDelay(bool) error |
| net | \*IPConn | ReadFrom([]uint8) int,  Addr,  errorint,  Addr,  error(int,  Addr,  errorint,  Addr,  error) |
| net | \*TCPListener | Accept() Conn,  errorConn,  error(Conn,  errorConn,  error) |
| net | \*TCPListener | Addr() Addr |
| net | IP | String() string |
| net | \*IPAddr | String() string |
| net | \*UDPConn | ReadFrom([]uint8) int,  Addr,  errorint,  Addr,  error(int,  Addr,  errorint,  Addr,  error) |
| net | \*IPConn | WriteToIP([]uint8,  \*IPAddr) int,  errorint,  error(int,  errorint,  error) |
| net | \*TCPConn | Close() error |
| net | \*UDPConn | File() \*os.File,  error\*os.File,  error(\*os.File,  error\*os.File,  error) |
| net | \*IPConn | Close() error |
| net/smtp | \*Client | Data() io.WriteCloser,  errorio.WriteCloser,  error(io.WriteCloser,  errorio.WriteCloser,  error) |
| net/smtp | \*Client | Quit() error |
| net/smtp | \*Client | Verify(string) error |
| net/smtp | \*Client | Mail(string) error |
| net/smtp | \*Client | StartTLS(\*tls.Config) error |
| net/smtp | \*Client | Extension(string) bool,  stringbool,  string(bool,  stringbool,  string) |
| net/smtp | \*Client | Auth(Auth) error |
| net/smtp | \*Client | Rcpt(string) error |
| net/smtp | \*Client | Reset() error |
| os | FileMode | Perm() FileMode |
| os | \*ProcessState | String() string |
| os | \*File | Sync() error |
| os | \*Process | Kill() error |
| os | \*ProcessState | Sys() interface{} |
| os | \*File | Readdirnames(int) []string,  error[]string,  error([]string,  error[]string,  error) |
| os | FileMode | IsDir() bool |
| os | \*File | Readdir(int) []FileInfo,  error[]FileInfo,  error([]FileInfo,  error[]FileInfo,  error) |
| os | FileMode | String() string |
| os | \*File | Name() string |
| os | \*LinkError | Error() string |
| os | \*PathError | Error() string |
| os | \*File | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| os | \*File | ReadAt([]uint8,  int64) int,  errorint,  error(int,  errorint,  error) |
| os | \*Process | Wait() \*ProcessState,  error\*ProcessState,  error(\*ProcessState,  error\*ProcessState,  error) |
| os | \*File | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| os | \*Process | Signal(Signal) error |
| os | \*SyscallError | Error() string |
| os | \*File | Chmod(FileMode) error |
| os | \*File | Fd() uintptr |
| os | \*File | WriteString(string) int,  errorint,  error(int,  errorint,  error) |
| os | \*Process | Release() error |
| os | \*File | WriteAt([]uint8,  int64) int,  errorint,  error(int,  errorint,  error) |
| os | \*File | Chown(int,  int) error |
| os | \*File | Stat() FileInfo,  errorFileInfo,  error(FileInfo,  errorFileInfo,  error) |
| os | \*ProcessState | SystemTime() time.Duration |
| os | \*File | Seek(int64,  int) int64,  errorint64,  error(int64,  errorint64,  error) |
| os | \*ProcessState | UserTime() time.Duration |
| os | \*ProcessState | Exited() bool |
| os | \*ProcessState | Success() bool |
| os | \*ProcessState | Pid() int |
| os | \*File | Close() error |
| os | \*ProcessState | SysUsage() interface{} |
| os | \*File | Chdir() error |
| os | \*File | Truncate(int64) error |
| archive/tar | \*Writer | Flush() error |
| archive/tar | \*Reader | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| archive/tar | \*Reader | Next() \*Header,  error\*Header,  error(\*Header,  error\*Header,  error) |
| archive/tar | \*Writer | Close() error |
| archive/tar | \*Writer | WriteHeader(\*Header) error |
| archive/tar | \*Writer | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| compress/zlib | \*Writer | Flush() error |
| compress/zlib | \*Writer | Close() error |
| compress/zlib | \*Writer | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| net/http/httputil | \*ClientConn | Write(\*http.Request) error |
| net/http/httputil | \*ClientConn | Hijack() net.Conn,  \*bufio.Readernet.Conn,  \*bufio.Reader(net.Conn,  \*bufio.Readernet.Conn,  \*bufio.Reader) |
| net/http/httputil | \*ClientConn | Pending() int |
| net/http/httputil | \*ClientConn | Do(\*http.Request) \*http.Response,  error\*http.Response,  error(\*http.Response,  error\*http.Response,  error) |
| net/http/httputil | \*ClientConn | Read(\*http.Request) \*http.Response,  error\*http.Response,  error(\*http.Response,  error\*http.Response,  error) |
| net/http/httputil | \*ServerConn | Read() \*http.Request,  error\*http.Request,  error(\*http.Request,  error\*http.Request,  error) |
| net/http/httputil | \*ServerConn | Hijack() net.Conn,  \*bufio.Readernet.Conn,  \*bufio.Reader(net.Conn,  \*bufio.Readernet.Conn,  \*bufio.Reader) |
| net/http/httputil | \*ServerConn | Pending() int |
| net/http/httputil | \*ServerConn | Write(\*http.Request,  \*http.Response) error |
| net/http/httputil | \*ClientConn | Close() error |
| net/http/httputil | \*ServerConn | Close() error |
| io | \*SectionReader | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| io | \*PipeWriter | Write([]uint8) int,  errorint,  error(int,  errorint,  error) |
| io | \*PipeWriter | CloseWithError(error) error |
| io | \*PipeWriter | Close() error |
| io | \*SectionReader | Size() int64 |
| io | \*PipeReader | Close() error |
| io | \*PipeReader | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| io | \*SectionReader | ReadAt([]uint8,  int64) int,  errorint,  error(int,  errorint,  error) |
| io | \*SectionReader | Seek(int64,  int) int64,  errorint64,  error(int64,  errorint64,  error) |
| io | \*PipeReader | CloseWithError(error) error |
| io | \*LimitedReader | Read([]uint8) int,  errorint,  error(int,  errorint,  error) |
| archive/zip | \*File | FileInfo() os.FileInfo |
| archive/zip | \*FileHeader | ModTime() time.Time |
| archive/zip | \*File | Open() io.ReadCloser,  errorio.ReadCloser,  error(io.ReadCloser,  errorio.ReadCloser,  error) |
| archive/zip | \*ReadCloser | Close() error |
| archive/zip | \*Writer | Close() error |
| archive/zip | \*FileHeader | FileInfo() os.FileInfo |
| archive/zip | \*File | ModTime() time.Time |
| archive/zip | \*File | Mode() os.FileMode |
| archive/zip | \*Writer | CreateHeader(\*FileHeader) io.Writer,  errorio.Writer,  error(io.Writer,  errorio.Writer,  error) |
| archive/zip | \*Writer | Create(string) io.Writer,  errorio.Writer,  error(io.Writer,  errorio.Writer,  error) |
| archive/zip | \*FileHeader | Mode() os.FileMode |
| runtime | \*MemProfileRecord | Stack() []uintptr |
| runtime | \*Func | Entry() uintptr |
| runtime | \*TypeAssertionError | Error() string |
| runtime | \*StackRecord | Stack() []uintptr |
| runtime | \*MemProfileRecord | InUseBytes() int64 |
| runtime | \*MemProfileRecord | InUseObjects() int64 |
| runtime | \*Func | FileLine(uintptr) string,  intstring,  int(string,  intstring,  int) |
| runtime | \*Func | Name() string |
| net/http | \*Server | Serve(net.Listener) error |
| net/http | Dir | Open(string) File,  errorFile,  error(File,  errorFile,  error) |
| net/http | \*Client | Head(string) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | \*Client | Do(\*Request) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | \*Request | FormValue(string) string |
| net/http | \*Request | ParseForm() error |
| net/http | \*Request | UserAgent() string |
| net/http | Header | Write(io.Writer) error |
| net/http | \*Client | Get(string) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | \*Client | Post(string,  string,  io.Reader) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | \*Client | PostForm(string,  url.Values) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | \*Request | Referer() string |
| net/http | \*Response | Write(io.Writer) error |
| net/http | \*Request | FormFile(string) multipart.File,  \*multipart.FileHeader,  errormultipart.File,  \*multipart.FileHeader,  error(multipart.File,  \*multipart.FileHeader,  errormultipart.File,  \*multipart.FileHeader,  error) |
| net/http | \*Request | MultipartReader() \*multipart.Reader,  error\*multipart.Reader,  error(\*multipart.Reader,  error\*multipart.Reader,  error) |
| net/http | \*Request | Write(io.Writer) error |
| net/http | \*Request | ParseMultipartForm(int64) error |
| net/http | \*Request | Cookie(string) \*Cookie,  error\*Cookie,  error(\*Cookie,  error\*Cookie,  error) |
| net/http | \*Request | WriteProxy(io.Writer) error |
| net/http | \*Cookie | String() string |
| net/http | \*Request | Cookies() []\*Cookie |
| net/http | \*Response | Cookies() []\*Cookie |
| net/http | Header | WriteSubset(io.Writer,  map[string]bool) error |
| net/http | \*ProtocolError | Error() string |
| net/http | Header | Get(string) string |
| net/http | \*Transport | RoundTrip(\*Request) \*Response,  error\*Response,  error(\*Response,  error\*Response,  error) |
| net/http | \*Server | ListenAndServeTLS(string,  string) error |
| net/http | \*Server | ListenAndServe() error |
| net/http | \*Response | Location() \*url.URL,  error\*url.URL,  error(\*url.URL,  error\*url.URL,  error) |
| net/http | \*Request | ProtoAtLeast(int,  int) bool |
| net/http | \*Response | ProtoAtLeast(int,  int) bool |
| database/sql | NullString | Value() driver.Value,  errordriver.Value,  error(driver.Value,  errordriver.Value,  error) |
| database/sql | \*Tx | Stmt(\*Stmt) \*Stmt |
| database/sql | NullFloat64 | Value() driver.Value,  errordriver.Value,  error(driver.Value,  errordriver.Value,  error) |
| database/sql | \*DB | Query(string,  ...interface{}) \*Rows,  error\*Rows,  error(\*Rows,  error\*Rows,  error) |
| database/sql | \*Stmt | Query(...interface{}) \*Rows,  error\*Rows,  error(\*Rows,  error\*Rows,  error) |
| database/sql | \*Rows | Scan(...interface{}) error |
| database/sql | \*NullFloat64 | Scan(interface{}) error |
| database/sql | \*Stmt | Exec(...interface{}) Result,  errorResult,  error(Result,  errorResult,  error) |
| database/sql | \*Rows | Next() bool |
| database/sql | \*Stmt | Close() error |
| database/sql | \*Row | Scan(...interface{}) error |
| database/sql | \*Rows | Close() error |
| database/sql | \*Tx | Rollback() error |
| database/sql | \*DB | Prepare(string) \*Stmt,  error\*Stmt,  error(\*Stmt,  error\*Stmt,  error) |
| database/sql | \*DB | QueryRow(string,  ...interface{}) \*Row |
| database/sql | \*Tx | QueryRow(string,  ...interface{}) \*Row |
| database/sql | \*Rows | Columns() []string,  error[]string,  error([]string,  error[]string,  error) |
| database/sql | \*Tx | Query(string,  ...interface{}) \*Rows,  error\*Rows,  error(\*Rows,  error\*Rows,  error) |
| database/sql | \*DB | Close() error |
| database/sql | \*DB | Begin() \*Tx,  error\*Tx,  error(\*Tx,  error\*Tx,  error) |
| database/sql | \*DB | Driver() driver.Driver |
| database/sql | \*Tx | Exec(string,  ...interface{}) Result,  errorResult,  error(Result,  errorResult,  error) |
| database/sql | NullInt64 | Value() driver.Value,  errordriver.Value,  error(driver.Value,  errordriver.Value,  error) |
| database/sql | \*NullInt64 | Scan(interface{}) error |
| database/sql | \*Rows | Err() error |
| database/sql | NullBool | Value() driver.Value,  errordriver.Value,  error(driver.Value,  errordriver.Value,  error) |
| database/sql | \*Stmt | QueryRow(...interface{}) \*Row |
| database/sql | \*Tx | Commit() error |
| database/sql | \*NullString | Scan(interface{}) error |
| database/sql | \*DB | Exec(string,  ...interface{}) Result,  errorResult,  error(Result,  errorResult,  error) |
| database/sql | \*Tx | Prepare(string) \*Stmt,  error\*Stmt,  error(\*Stmt,  error\*Stmt,  error) |
| database/sql | \*NullBool | Scan(interface{}) error |
| net/http/cookiejar | \*Jar | Cookies(\*url.URL) []\*http.Cookie |
| net/rpc | \*Client | Call(string,  interface{},  interface{}) error |
| net/rpc | \*Server | Register(interface{}) error |
| net/rpc | \*Server | RegisterName(string,  interface{}) error |
| net/rpc | \*Server | ServeRequest(ServerCodec) error |
| net/rpc | \*Client | Go(string,  interface{},  interface{},  chan \*Call) \*Call |
| net/rpc | ServerError | Error() string |
| net/rpc | \*Client | Close() error |
| runtime/cgo | Handle | Value() interface{} |
| net/mail | Header | Get(string) string |
| net/mail | Header | AddressList(string) []\*Address,  error[]\*Address,  error([]\*Address,  error[]\*Address,  error) |
| net/mail | \*Address | String() string |
| net/mail | Header | Date() time.Time,  errortime.Time,  error(time.Time,  errortime.Time,  error) |
| net/url | \*URL | IsAbs() bool |
| net/url | Values | Encode() string |
| net/url | \*Userinfo | Username() string |
| net/url | \*Userinfo | String() string |
| net/url | \*Userinfo | Password() string,  boolstring,  bool(string,  boolstring,  bool) |
| net/url | \*URL | Query() Values |
| net/url | \*URL | Parse(string) \*URL,  error\*URL,  error(\*URL,  error\*URL,  error) |
| net/url | \*URL | RequestURI() string |
| net/url | EscapeError | Error() string |
| net/url | \*Error | Error() string |
| net/url | \*URL | ResolveReference(\*URL) \*URL |
| net/url | Values | Get(string) string |
| net/url | \*URL | String() string |
| runtime/pprof | \*Profile | Count() int |
| runtime/pprof | \*Profile | Name() string |
| runtime/pprof | \*Profile | WriteTo(io.Writer,  int) error |
| net/textproto | \*Reader | ReadLine() string,  errorstring,  error(string,  errorstring,  error) |
| net/textproto | \*Conn | ReadLineBytes() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/textproto | \*Reader | ReadMIMEHeader() MIMEHeader,  errorMIMEHeader,  error(MIMEHeader,  errorMIMEHeader,  error) |
| net/textproto | MIMEHeader | Get(string) string |
| net/textproto | \*Conn | ReadDotLines() []string,  error[]string,  error([]string,  error[]string,  error) |
| net/textproto | \*Conn | DotReader() io.Reader |
| net/textproto | \*Conn | ReadMIMEHeader() MIMEHeader,  errorMIMEHeader,  error(MIMEHeader,  errorMIMEHeader,  error) |
| net/textproto | \*Reader | ReadResponse(int) int,  string,  errorint,  string,  error(int,  string,  errorint,  string,  error) |
| net/textproto | \*Reader | DotReader() io.Reader |
| net/textproto | \*Reader | ReadCodeLine(int) int,  string,  errorint,  string,  error(int,  string,  errorint,  string,  error) |
| net/textproto | \*Conn | Next() uint |
| net/textproto | \*Error | Error() string |
| net/textproto | \*Reader | ReadDotBytes() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/textproto | \*Conn | ReadContinuedLineBytes() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/textproto | \*Conn | Close() error |
| net/textproto | ProtocolError | Error() string |
| net/textproto | \*Reader | ReadContinuedLine() string,  errorstring,  error(string,  errorstring,  error) |
| net/textproto | \*Conn | ReadDotBytes() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/textproto | \*Conn | DotWriter() io.WriteCloser |
| net/textproto | \*Conn | ReadResponse(int) int,  string,  errorint,  string,  error(int,  string,  errorint,  string,  error) |
| net/textproto | \*Conn | ReadCodeLine(int) int,  string,  errorint,  string,  error(int,  string,  errorint,  string,  error) |
| net/textproto | \*Conn | Cmd(string,  ...interface{}) uint,  erroruint,  error(uint,  erroruint,  error) |
| net/textproto | \*Writer | DotWriter() io.WriteCloser |
| net/textproto | \*Pipeline | Next() uint |
| net/textproto | \*Conn | ReadContinuedLine() string,  errorstring,  error(string,  errorstring,  error) |
| net/textproto | \*Conn | ReadLine() string,  errorstring,  error(string,  errorstring,  error) |
| net/textproto | \*Reader | ReadLineBytes() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/textproto | \*Conn | PrintfLine(string,  ...interface{}) error |
| net/textproto | \*Reader | ReadContinuedLineBytes() []uint8,  error[]uint8,  error([]uint8,  error[]uint8,  error) |
| net/textproto | \*Writer | PrintfLine(string,  ...interface{}) error |
| net/textproto | \*Reader | ReadDotLines() []string,  error[]string,  error([]string,  error[]string,  error) |

# Sinks of Hyperledger Fabric

| Package | Function Signature |
|---|---|
| hyperledger/fabric-chaincode-go/shim | Success(payload []byte) pb.Response |
| hyperledger/fabric-chaincode-go/shim | Error(msg string) pb.Response |

| Package | Receiver | Method Signature |
|---|---|---|
| hyperledger/fabric-chaincode-go/shim | (s \*ChaincodeStub) | PutState(key string, value []byte) error |
| hyperledger/fabric-chaincode-go/shim | (s \*ChaincodeStub) | PutPrivateData(collection string, key string, value []byte) error |
| hyperledger/fabric-chaincode-go/shim | (s \*ChaincodeStub) | DelState(key string) error |
| hyperledger/fabric-chaincode-go/shim | (s \*ChaincodeStub) | DelPrivateData(collection string, key string) error |

# Sinks of Tendermint Core

| Package | Receiver | Method Signature |
|---|---|---|
| tendermint/abci/types | (m \*ResponseBeginBlock) | Marshal() (dAtA []byte, err error) |
| tendermint/abci/types | (m \*ResponseBeginBlock) | MarshalTo(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseBeginBlock) | MarshalToSizedBuffer(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseBeginBlock) | XXX_Marshal(b []byte, deterministic bool) ([]byte, error) |
| tendermint/abci/types | (m \*ResponseBeginBlock) | XXX_Merge(src proto.Message) |
| tendermint/abci/types | (m \*ResponseDeliverTx) | Marshal() (dAtA []byte, err error) |
| tendermint/abci/types | (m \*ResponseDeliverTx) | MarshalTo(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseDeliverTx) | MarshalToSizedBuffer(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseDeliverTx) | XXX_Marshal(b []byte, deterministic bool) ([]byte, error) |
| tendermint/abci/types | (m \*ResponseDeliverTx) | XXX_Merge(src proto.Message) |
| tendermint/abci/types | (m \*ResponseEndBlock) | Marshal() (dAtA []byte, err error) |
| tendermint/abci/types | (m \*ResponseEndBlock) | MarshalTo(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseEndBlock) | MarshalToSizedBuffer(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseEndBlock) | XXX_Marshal(b []byte, deterministic bool) ([]byte, error) |
| tendermint/abci/types | (m \*ResponseEndBlock) | XXX_Merge(src proto.Message) |
| tendermint/abci/types | (m \*ResponseCommit) | Marshal() (dAtA []byte, err error) |
| tendermint/abci/types | (m \*ResponseCommit) | MarshalTo(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseCommit) | MarshalToSizedBuffer(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseCommit) | XXX_Marshal(b []byte, deterministic bool) ([]byte, error) |
| tendermint/abci/types | (m \*ResponseCommit) | XXX_Merge(src proto.Message) |
| tendermint/abci/types | (m \*ResponseCheckTx) | Marshal() (dAtA []byte, err error) |
| tendermint/abci/types | (m \*ResponseCheckTx) | MarshalTo(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseCheckTx) | MarshalToSizedBuffer(dAtA []byte) (int, error) |
| tendermint/abci/types | (m \*ResponseCheckTx) | XXX_Marshal(b []byte, deterministic bool) ([]byte, error) |
| tendermint/abci/types | (m \*ResponseCheckTx) | XXX_Merge(src proto.Message) |

# Sinks of Cosmos SDK

| Package | Function Signature |
|---|---|
| cosmos-sdk/types/errors | Register(codespace string, code uint32, description string) \*Error |
| cosmos-sdk/types/errors | ABCIInfo(err error, debug bool) (codespace string, code uint32, log string) |
| cosmos-sdk/types/errors | Redact(err error) error  |
| cosmos-sdk/types/errors | ABCIError(codespace string, code uint32, log string) error |
| cosmos-sdk/types/errors | New(codespace string, code uint32, desc string) \*Error  |
| cosmos-sdk/types/errors | Wrap(err error, description string) error |
| cosmos-sdk/types/errors | Wrapf(err error, format string, args ...interface{}) error |
| cosmos-sdk/types/errors | Recover(err \*error) |
| cosmos-sdk/types/errors | WithType(err error, obj interface{}) error |

| Package | Receiver | Method Signature |
|---|---|---|
| cosmos-sdk/types/errors | \*Error | Wrap(desc string) error |
| cosmos-sdk/types/errors | \*Error | Wrapf(desc string, args ...interface{}) error |
| cosmos-sdk/store/types | \*KVStore | Set(key, value []byte) |
| cosmos-sdk/store/types | \*KVStore | Delete(key []byte) |
| cosmos-sdk/store/types/kv | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/kv | \*Store | Delete(key []byte) |
| cosmos-sdk/store/types/dbadapter | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/dbadapter | \*Store | Delete(key []byte) |
| cosmos-sdk/store/types/gaskv | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/gaskv | \*Store | Delete(key []byte) |
| cosmos-sdk/store/types/iavl | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/iavl | \*Store | Delete(key []byte) |
| cosmos-sdk/store/types/listenkv | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/listenkv  | \*Store | Delete(key []byte) |
| cosmos-sdk/store/types/prefix | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/prefix | \*Store | Delete(key []byte) |
| cosmos-sdk/store/types/tracekv | \*Store | Set(key, value []byte) |
| cosmos-sdk/store/types/tracekv | \*Store | Delete(key []byte) |
